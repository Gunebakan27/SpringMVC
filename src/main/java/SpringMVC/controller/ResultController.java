package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultController {
	//bu yazım ilkel
//	@RequestMapping("submit")
//	public String islemYap(HttpServletRequest req) {
//		int s1 = Integer.parseInt(req.getParameter("sayi1"));
//		int s2 = Integer.parseInt(req.getParameter("sayi2"));
//		int toplam = s1 + s2;
//		int carpim = s1 * s2;
//		HttpSession session = req.getSession();
//		session.setAttribute("sayilarinToplami", toplam);
//		session.setAttribute("sayilarinCarpimi", carpim);
//		return "sonuc";
//	}
	@RequestMapping("submit")
	public String islemYap(@RequestParam("sayi1") int s1, @RequestParam("sayi2") int s2
			, Model m) {
		//requestten sayı1 parametresini alıyor, int s1 olarak saklıyor
				//		int toplam = s1 + s2;                                             Model: verileri saklayıcı
//				int carpim = s1 * s2;
				//alta toplam ve carpımda yazabiliriz
				//yukarıdaki işlemleri Model m nin içine gömecez. alttada ekliyoruz. sayıların toplamı->sonuc.jsx deki adı, buradan ona toplam gönderiliyor
		m.addAttribute("sumOfNumbers", (s1+s2));
		m.addAttribute("multiplyOfNumbers", (s1*s2));//bunlar model kısmı
		return "result"; //burası view
	}
}
