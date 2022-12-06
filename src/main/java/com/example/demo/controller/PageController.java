package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

// Contrller는 페이지 주소를 작성할 때 사용 하는 어노테이션
@Controller
public class PageController {
	@GetMapping("/")
	public String callIndexPage() {
		// return 에 html 파일 이름을 작성
		return "index";
	}
	
	// 사용자가(클라이언트) 가 /hoem라고 주소를 입력하면
	// home 이름을 가진 html을 return 한다는 걸 의미
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {
		
		String ip = request.getRemoteAddr(); // IP 추적
		System.out.println("요청 받은 IP : "+ ip);
		
		return "home";
	}
	
	// html 이름 같게 해줘야한다
	@GetMapping("/younjae")
	public String callyounjaePage() {
		return "younjae";
		// html 이름 같게 해줘야한다;
		// 옳지 잘한다 재영이 화이띵;
		
		
		
	}
	
	@GetMapping("/movie")
	public String callmoviePage() { //집에가 임마
		return "movie";
	}
	
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	
	@GetMapping("/login3")
	public String callLogin3Page() {
		// return 에 html 파일 이름을 작성 
		return "login3";
	}
	
	// 페이지 이동
	@GetMapping("/users")
	public String callUsersPage(HttpServletRequest req, ModelMap map){
		// ModelMap : HTML에 데이터를 전달함 ( HTML에 데이터를 전달하는 방법은 크게 2가지 )
		// 1. AJAX를 이용한 데이터 처리
		// 2. ModelMap을 활용한 데이터 처리
		// 실무에서는 1번과 2번을 번갈아가며 쓰지만, 우리는 1번에 초점을 두고 공부해야함
		// 2번은 쓰는 곳도 있고 안쓰는 곳도 있기 때문에
		HttpSession session = req.getSession(); // 세션 호출
		System.out.println(req.getSession().getId());
		String name = (String) session.getAttribute("name"); // 세션에 저장한 데이터 호출
		System.out.println("name ===> " + name);
		map.addAttribute("name", name); // 사용자 이름 Map에 추가
		return "users";
	}
	
	
//	@GetMapping("/dept")
//	public String callLogin2Page(HttpServletRequest request) {
//		String ip = request.getRemoteAddr(); // IP 추적
//		System.out.println("요청 받은 IP : "+ ip);
//		return "dept";
//	}
	
	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
	
	@GetMapping("/dept")
	public String callDeptPage() {
		return "dept";
	}
	
	
	
}