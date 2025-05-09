package behaviouraldesignpattern.chainofresponsiblity.enums;

import lombok.Getter;

@Getter
public enum LoggerLevel {
    INFO(1),
    DEBUG(2),
    ERROR(3);

    private final Integer level;

    LoggerLevel(Integer level) {
        this.level = level;
    }
}
