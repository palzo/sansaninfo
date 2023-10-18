package com.example.sansaninfo.MountainInfoData

import com.google.gson.annotations.SerializedName
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

//@Root(name = "response", strict = false)
//data class Response(
//    @field:Element(name = "body")
//    val body: Body,
//    @field:Element(name = "header")
//    val header: Header,
//)
//data class Header(
//    @field:Element(name = "resultCode")
//    var resultCode: Int,
//    @field:Element(name = "resultMsg")
//    var resultMsg: String
//)
//data class Body(
//    @field:Element(name = "items")
//    val items: Items
//)
//data class Items(
//    @field:ElementList(entry = "item", inline = true)
//    var item: List<Item>? = ArrayList()
//)
//data class Item(
//
//    @field:Element(name = "crcmrsghtngetcimageseq") // 5
//    val crcmrsghtngetcimageseq: String,
//    @field:Element(name = "crcmrsghtnginfodscrt") // 3
//    val crcmrsghtnginfodscrt: String,
//    @field:Element(name = "crcmrsghtnginfoetcdscrt") // 4
//    val crcmrsghtnginfoetcdscrt: String,
//    @field:Element(name = "hkngpntdscrt") // 6
//    var hkngpntdscrt: String,
//    @field:Element(name = "hndfmsmtnmapimageseq") // 7
//    val hndfmsmtnmapimageseq: String,
//    @field:Element(name = "hndfmsmtnslctnrson") // 100대명산 선정이유 16
//    val hndfmsmtnslctnrson: String,
//    @field:Element(name = "mntnattchimageseq") // 8
//    val mntnattchimageseq: String,
//    @field:Element(name = "mntnid")  // 산 코드 14
//    val mntId: String,
//    @field:Element(name = "mntninfodscrt")  // 산정보개관(개관) 20
//    val mntninfodscrt: String,
//    @field:Element(name = "mntninfodtlinfocont")  // 상세정보 1
//    val mntInfo: String,
//    @field:Element(name = "mntninfohght") // 산 높이 18
//    val mntHeight: String,
//
////    @field:Element(name = "mntninfomangrtlno")
////    val mntninfomangrtlno: String,
//
//    @field:Element(name = "mntninfomapdnldfilenm") // 9
//    var mntninfomapdnldfilenm: String,
//    @field:Element(name = "mntninfomngmemnbdnm") // 19
//    val mntninfomngmemnbdnm: String,
//    @field:Element(name = "mntninfopoflc") // 상세 주소 17
//    val mntninfopoflc: String,
//    @field:Element(name = "mntninfotrnspinfoimageseq") // 10
//    val mntninfotrnspinfoimageseq: String,
//    @field:Element(name = "mntnnm")  // 산 이름 15
//    val mntName: String,
//    @field:Element(name = "mntnsbttlinfo")  // 산정보부제 11
//    val mntSubInfo: String,
//    @field:Element(name = "pbtrninfodscrt")  // 2
//    val pbtrninfodscrt: String,
//    @field:Element(name = "ptmntrcmmncoursdscrt") // 12
//    var ptmntrcmmncoursdscrt: String,
//    @field:Element(name = "rcmmncoursimageseq") // 13
//    val rcmmncoursimageseq: String,
//)