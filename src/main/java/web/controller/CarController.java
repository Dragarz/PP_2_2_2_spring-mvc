package web.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

@Controller
public class CarController {

	@GetMapping(value = "/cars")
	public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		List<Car> cars = Arrays.asList(
				new Car("BMW", 1, "red"),
				new Car("BMW", 2, "black"),
				new Car("BMW", 3, "purpler"),
				new Car("BMW", 4, "white"),
				new Car("BMW", 5, "green")
		);

		List<Car> result = new CarServiceImp().getCars(count, cars);

		model.addAttribute("cars", result);

		return "cars";
	}
	
}