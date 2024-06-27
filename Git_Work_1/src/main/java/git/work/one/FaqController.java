package git.work.one;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.Common;
import dao.FaqDAO;
import vo.FaqVO;

@Controller
public class FaqController {
	
	//지현. faq
	FaqDAO faq_dao;
	
	public FaqController(FaqDAO faq_dao) {
		this.faq_dao = faq_dao;
	}
	
	//faq 첫페이지 출력
	@RequestMapping(value= {"/","/faq.do"})
	public String select(Model model){
		List<FaqVO> list = new ArrayList<FaqVO>();
		list = faq_dao.selectlist();
		model.addAttribute("list", list);
		return Common.Visit_faq.VIEW_PATH + "faq.jsp";
	}

}
