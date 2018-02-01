package de.tillmannheigel.examples.EnumInController.Converter;

import de.tillmannheigel.examples.EnumInController.Enum.Vehicle;

import java.beans.PropertyEditorSupport;

public class VehicleConverter extends PropertyEditorSupport {
    public void setAsText(final String text) {
        setValue(Vehicle.fromValue(text));
    }
}
