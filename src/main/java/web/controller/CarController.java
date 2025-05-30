package web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {

	private final CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars")
	public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		List<Car> result = carService.getCars(count);

		model.addAttribute("cars", result);

		return "cars";
	}
	
}