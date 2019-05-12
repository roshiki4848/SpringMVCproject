package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.bean.案件Bean;
import com.mycompany.myapp.service.impl.案件Service;

@Controller
public class 案件Controller {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		案件Bean bean = new 案件Bean();
		bean.set案件名称("案件名称");
		bean.set案件概要("案件概要");
		bean.set案件場所("案件場所");
		bean.set担当職種("担当職種");
		bean.set所在工程("所在工程");
		bean.set作業開始年月日("作業開始年月日");
		bean.set作業预计终了年月("作業预计终了年月");
		bean.set作業实际终了年月("作業实际终了年月");
		bean.set募集人数("募集人数");
		bean.set開発言語("開発言語");
		bean.setFrameWork("FrameWork");
		bean.setツール("ツール");
		bean.setOS("OS");
		bean.setDB("DB");


		new 案件Controller().案件save(bean);
	}

	@RequestMapping(value = "案件save", method = RequestMethod.POST)
	String 案件save(案件Bean bean) {

		String sMsg = null;
		// 1、追加案件信息
		案件Service service = new 案件Service();
		sMsg = service.追加案件_by案件Bean(bean);

		// 2、如果1、的返回值sMsg为空
		if (sMsg == null || sMsg.equals("")) {
			// if (StringUtils.isEmpty(sMsg)) {
			// 2.1、返回"案件検索"
			return "案件検索";

		} else {
			// 3、如果1、的返回值sMsg不为空
			// 3.1、追加model的Attribute
			//    		model.addAttribute("titleName", "社員追加");
			//    		model.addAttribute("s_ID", bean.getS_ID());
			//    		model.addAttribute("番号", bean.get番号());
			//    		model.addAttribute("姓名", bean.get姓名());
			//    		model.addAttribute("電話番号", bean.get電話番号());
			//    		model.addAttribute("性別", bean.get性別());
			//    		model.addAttribute("生年月日", bean.get生年月日());
			//    		model.addAttribute("入社年月日", bean.get入社年月日());
			//    		model.addAttribute("契約種類", bean.get契約種類());
			//    		model.addAttribute("errorMsg", sMsg);
			// 3.2、返回"案件明細"
			return "案件明細";
		}
	}

	@RequestMapping(value = "案件edit", method = RequestMethod.GET)
	public String 案件edit() {
		return "案件明細";
	}
}
