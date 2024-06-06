package com.patternscreative.builder.builders;

import com.patternscreative.builder.components.CarType;
import com.patternscreative.builder.components.Engine;
import com.patternscreative.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
