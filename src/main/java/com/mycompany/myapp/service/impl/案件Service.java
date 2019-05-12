package com.mycompany.myapp.service.impl;


import java.io.IOException;

import com.mycompany.myapp.bean.案件Bean;
import com.mycompany.myapp.service.文件db;

public class 案件Service {
	String[] 案件信息= {"案件名称","案件概要","担当職種","案件場所","所在工程","作業開始年月日","作業预计终了年月","作業实际终了年月","募集人数"};
	public String 追加案件_by案件Bean(案件Bean bean) {

		// 1、 追加处理
		案件Service service = new 案件Service();
		service.追加案件_byFile_db_案件Bean(bean);

		// 2、返回空字符串
		return "";
	}

	private void 追加案件_byFile_db_案件Bean(案件Bean bean) {
		// TODO 自動生成されたメソッド・スタブ
		// 1、取得【案件名称文件全路径】

		   //1.1、 取得【路径名】
		文件db db = new 文件db("案件");
		String 路径名 = db.getSPath();
		  //1.2、【案件名称文件全路径】=【路径名】+"案件名称"+".txt"
		String 案件名称文件全路径 = 路径名 + "案件名称"+".txt";
		String 案件概要文件全路径 = 路径名 + "案件概要"+".txt";
		String 案件場所文件全路径 = 路径名 + "案件場所"+".txt";
		String 担当職種文件全路径 = 路径名 + "担当職種"+".txt";
		String 所在工程文件全路径 = 路径名 + "所在工程"+".txt";
		String 作業開始年月日文件全路径 = 路径名 + "作業開始年月日"+".txt";
		String 作業预计终了年月文件全路径 = 路径名 + "作業预计终了年月"+".txt";
		String 作業实际终了年月文件全路径 = 路径名 + "作業实际终了年月"+".txt";
		String 募集人数文件全路径 = 路径名 + "募集人数"+".txt";


		// 2、採番
		  // 2.1 取得【已有案件件数】
		int 已有案件件数 = 0;
		try {
			已有案件件数 = db.採番(案件名称文件全路径);
			已有案件件数 = db.採番(案件概要文件全路径);
			已有案件件数 = db.採番(案件場所文件全路径);
			已有案件件数 = db.採番(担当職種文件全路径);
			已有案件件数 = db.採番(所在工程文件全路径);
			已有案件件数 = db.採番(作業開始年月日文件全路径);
			已有案件件数 = db.採番(作業预计终了年月文件全路径);
			已有案件件数 = db.採番(作業实际终了年月文件全路径);
			已有案件件数 = db.採番(募集人数文件全路径);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		 // 2.2 ID=【已有案件件数】+ 1
		int ID= 已有案件件数 +1;

		// 3、循环处理案件信息的每一个数据文件
		for(String s : 案件信息) {

			// 3.1 取得【数据文件全路径】
			String 数据文件全路径 = 路径名 + s +".txt";

			// 3.2 如果是"案件名称"
			if(s.equals("案件名称")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get案件名称()!=null && !bean.get案件名称().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get案件名称());
					db.文件書込(数据文件全路径, ID + "," + bean.get案件名称());
				}
			}
		 	// 3.3 如果是"案件概要"
			if(s.equals("案件概要")) {
				//(1) 如果存在“案件概要”相关的入力信息
				if (bean.get案件概要()!=null && !bean.get案件概要().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get案件概要());
					db.文件書込(数据文件全路径, ID + "," + bean.get案件概要());
				}
			}
			if(s.equals("案件場所")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get案件場所()!=null && !bean.get案件場所().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get案件場所());
					db.文件書込(数据文件全路径, ID + "," + bean.get案件場所());
				}
			}
			if(s.equals("担当職種")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get担当職種()!=null && !bean.get担当職種().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get担当職種());
					db.文件書込(数据文件全路径, ID + "," + bean.get担当職種());
				}
			}
			if(s.equals("所在工程")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get所在工程()!=null && !bean.get所在工程().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get所在工程());
					db.文件書込(数据文件全路径, ID + "," + bean.get所在工程());
				}
			}
			if(s.equals("作業開始年月日")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get作業開始年月日()!=null && !bean.get作業開始年月日().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get作業開始年月日());
					db.文件書込(数据文件全路径, ID + "," + bean.get作業開始年月日());
				}
			}
			if(s.equals("作業预计终了年月")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get作業预计终了年月()!=null && !bean.get作業预计终了年月().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get作業预计终了年月());
					db.文件書込(数据文件全路径, ID + "," + bean.get作業预计终了年月());
				}
			}
			if(s.equals("作業实际终了年月")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get作業实际终了年月()!=null && !bean.get作業实际终了年月().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get作業实际终了年月());
					db.文件書込(数据文件全路径, ID + "," + bean.get作業实际终了年月());
				}
			}
			if(s.equals("募集人数")) {
		  		//(1) 如果存在“案件名称”相关的入力信息
				if (bean.get募集人数()!=null && !bean.get募集人数().equals("")) {
					// file_db.文件書込(path, ID + "," + bean.get募集人数());
					db.文件書込(数据文件全路径, ID + "," + bean.get募集人数());
				}
			}
		}
	}
}
