package bg.softuni.cardealerxml.service.dtos.imports;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "parts")
@XmlAccessorType(XmlAccessType.FIELD)
public class PartSeedRootDto {
    @XmlElement(name = "part")
    private List<PartSeedDto> parts;

    public List<PartSeedDto> getParts() {
        return parts;
    }

    public void setParts(List<PartSeedDto> parts) {
        this.parts = parts;
    }
}
