package com.example.advquerying.service.impl;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import com.example.advquerying.repositories.ShampooRepository;
import com.example.advquerying.service.ShampooService;
import org.dom4j.util.AttributeHelper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShampooServiceImpl implements ShampooService {

    private final ShampooRepository shampooRepository;

    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public List<String> getAllShampoosByGivenSize(String size) {
        Size sizeEnum = Size.valueOf(size.toUpperCase());
        return this.shampooRepository.findAllBySizeOrderById(sizeEnum)
                .stream()
                .map(s -> String.format("%s %s %.2flv.",
                        s.getBrand(),
                        s.getSize().name(),
                        s.getPrice().doubleValue()))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllShampoosByGivenSizeOrLabel(String size, long id) {
        Size sizeEnum = Size.valueOf(size.toUpperCase());
        return this.shampooRepository.findAllBySizeOrLabelIdOrderByPrice(sizeEnum, id)
                .stream()
                .map(s -> String.format("%s %s %.2flv.",
                        s.getBrand(),
                        s.getSize().name(),
                        s.getPrice().doubleValue()))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllShampoosContainingIngredient(List<String> strings) {
        Set<Shampoo> allByIngredientsNameIn = this.shampooRepository.findAllByIngredientsNameIn(strings);
        return allByIngredientsNameIn.stream()
                .map(Shampoo::getBrand)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllShampoosWithPriceHigherThan(BigDecimal price) {
        return this.shampooRepository.findAllByPriceGreaterThanOrderByPriceDesc(price)
                .stream()
                .map(s -> String.format("%s %s %.2flv.",
                        s.getBrand(),
                        s.getSize().name(),
                        s.getPrice().doubleValue()))
                .collect(Collectors.toList());
    }

    @Override
    public int countOfIngredientsWithPriceLesserThan(BigDecimal price) {
        return this.shampooRepository.findAllByPriceLessThan(price).size();
    }

    @Override
    public Set<String> getALlShampoosWithCountOfIngredientsBelowNumber(int number) {
        return this.shampooRepository.findAllWithIngredientCountLesserThan(number)
                .stream().map(Shampoo::getBrand)
                .collect(Collectors.toSet());
    }
}
