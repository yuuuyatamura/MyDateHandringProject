package com.example.DateHandring.service;

import org.springframework.stereotype.Service;

import com.example.DateHandring.domain.DateFormula;

@Service
public interface DateHandringService {



	//ここで、新規の日付を登録する
	void insert(DateFormula dateFormula);

//	//1件検索
//	public void select(DateFormula dateFormula) {
//		// TODO 自動生成されたメソッド・スタブ
//	}

//	//全件検索
//	public void selectAll(DateFormula dateFormula) {
//		// TODO 自動生成されたメソッド・スタブ
//	}

	//更新
}
