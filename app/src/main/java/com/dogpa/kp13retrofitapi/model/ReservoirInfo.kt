package com.dogpa.kp13retrofitapi.model

import androidx.compose.ui.graphics.Color


data class ReservoirInfo(
    val StationNo : String,
    val PercentageOfStorage : Double?,
    val Time: String
)


val reservoirDict:  Map<String, String> = mapOf("10501" to  "永和山水庫", "40203" to  "龍溪壩", "50209" to  "菱湖水庫", "50204" to  "山西蓄水塘", "30802" to  "阿公店水庫", "10216" to  "中庄調整池", "30601" to  "虎頭埤", "20405" to  "士林堰", "40202" to  "水簾壩", "20207" to  "青山壩", "20202" to  "石岡壩", "30603" to  "玉峰攔河堰", "10206" to  "榮華壩", "10801" to  "粗坑溪攔河堰", "20101" to  "鯉魚潭水庫", "50104" to  "赤崁水庫", "30803" to  "鳳山水庫", "50306" to  "津沙水庫", "50202" to  "田埔水庫", "50109" to  "烏溝蓄水塘", "50108" to  "小池水庫", "50303" to  "珠螺水壩", "20507" to  "武界壩", "20508" to  "明湖下池", "20509" to  "湖山水庫", "30901" to  "高屏溪攔河堰", "50214" to  "蘭湖", "50208" to  "蓮湖水庫", "50201" to  "太湖水庫", "30304" to  "東口攔河堰", "20504" to  "頭社水庫", "10208" to  "六堵攔河堰", "20501" to  "霧社水庫", "31201" to  "牡丹水庫", "10213" to  "羅好壩", "20201" to  "德基水庫", "10203" to  "西勢水庫", "30805" to  "中正湖", "20206" to  "馬鞍壩", "30306" to  "內埔子", "20503" to  "集集攔河堰", "10802" to  "羅東攔河堰", "20205" to  "天輪壩", "10405" to  "寶山第二水庫", "10212" to  "直潭壩", "50205" to  "榮湖水庫", "10601" to  "明德水庫", "50105" to  "西安水庫", "30403" to  "德元埤", "10401" to  "寶山水庫", "50210" to  "西湖水庫", "20505" to  "明潭下池", "40701" to  "酬勤水庫", "30401" to  "白河水庫", "10204" to  "新山水庫", "20204" to  "八寶攔河堰", "40201" to  "溪畔壩", "50203" to  "陽明湖水庫", "10404" to  "隆恩堰", "10209" to  "桂山壩", "30302" to  "蘭潭水庫", "10402" to  "青草湖", "20203" to  "谷關壩", "30305" to  "隘寮堰", "50307" to  "津沙1號壩", "50301" to  "勝利水庫", "50309" to  "東湧水庫", "31202" to  "龍鑾潭", "20506" to  "銃櫃壩", "10201" to  "石門水庫", "50206" to  "擎天水庫", "10210" to  "三峽攔河堰", "30301" to  "仁義潭水庫", "10205" to  "翡翠水庫", "10503" to  "大埔水庫", "30502" to  "曾文水庫", "30503" to  "南化水庫", "30501" to  "烏山頭水庫", "50212" to  "金湖水庫", "20510" to  "劍潭水庫", "10207" to  "鳶山堰", "10214" to  "阿玉壩", "50304" to  "儲水沃上壩", "30801" to  "澄清湖水庫", "31002" to  "甲仙攔河堰", "30402" to  "尖山埤", "31301" to  "成功水庫", "10215" to  "木瓜壩", "50106" to  "七美水庫", "50103" to  "東衛水庫", "10211" to  "青潭堰", "30504" to  "鏡面水庫", "30602" to  "鹽水埤", "50308" to  "坂里水庫", "30303" to  "鹿寮溪", "50305" to  "儲水沃水庫", "50207" to  "金沙水庫", "50213" to  "瓊林水庫", "20502" to  "日月潭水庫", "50302" to  "邱桂山水庫", "30804" to  "觀音湖", "50310" to  "后沃水庫", "50107" to  "澎湖海水淡化廠", "50102" to  "興仁水庫")


