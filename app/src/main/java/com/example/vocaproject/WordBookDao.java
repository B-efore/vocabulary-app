package com.example.vocaproject;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface WordBookDao {
    //단어장 정보 업데이트
    @Update
    void setUpdateWordBook(WordBook wordbook);

    //단어장 하나 가져오기
    @Query("SELECT * FROM wordbook WHERE day =:day")
    WordBook getWordBook(int day);
}
