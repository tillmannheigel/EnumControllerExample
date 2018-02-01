package de.tillmannheigel.examples.EnumInController.Controller;

import de.tillmannheigel.examples.EnumInController.Converter.VehicleConverter;
import de.tillmannheigel.examples.EnumInController.Enum.Vehicle;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController public class ExampleController {

    @RequestMapping("/example")
    public String example(
            @RequestParam(required = false) Vehicle vehicle) {
        if (vehicle != null) {
            return "Yo, you are requesting a " + vehicle;
        }
        return "You are requesting nothing";
    }

    @InitBinder
    public void bindVehicles(final WebDataBinder webdataBinder) {
        webdataBinder.registerCustomEditor(Vehicle.class, new VehicleConverter());
    }
}
