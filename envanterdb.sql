/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 100113
Source Host           : localhost:3306
Source Database       : envanterdb

Target Server Type    : MYSQL
Target Server Version : 100113
File Encoding         : 65001

Date: 2016-07-28 11:18:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_adi` varchar(50) DEFAULT NULL,
  `admin_soyadi` varchar(50) DEFAULT NULL,
  `admin_kadi` varchar(50) DEFAULT NULL,
  `admin_sifre` varchar(50) DEFAULT NULL,
  `admin_mail` varchar(100) DEFAULT NULL,
  `admin_telefon` varchar(50) DEFAULT NULL,
  `admin_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'Serkan', 'Kaya', 'admin', '81dc9bdb52d04dc20036dbd8313ed055', null, null, '2016-07-26 11:21:46');

-- ----------------------------
-- Table structure for demirbaslar
-- ----------------------------
DROP TABLE IF EXISTS `demirbaslar`;
CREATE TABLE `demirbaslar` (
  `demirbas_id` int(11) NOT NULL AUTO_INCREMENT,
  `demirbas_urun_id` int(11) DEFAULT NULL,
  `demirbas_sube_id` int(11) DEFAULT NULL,
  `demirbas_teslimper_id` int(11) DEFAULT NULL,
  `demirbas_urun_adet` int(11) DEFAULT NULL,
  `demirbas_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`demirbas_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demirbaslar
-- ----------------------------
INSERT INTO `demirbaslar` VALUES ('2', '2', '1', null, '2', '2016-07-20 17:51:36');

-- ----------------------------
-- Table structure for firmalar
-- ----------------------------
DROP TABLE IF EXISTS `firmalar`;
CREATE TABLE `firmalar` (
  `firma_id` int(11) NOT NULL AUTO_INCREMENT,
  `firma_kat_id` int(11) DEFAULT NULL,
  `firma_adi` varchar(150) DEFAULT NULL,
  `firma_adres` varchar(255) DEFAULT NULL,
  `firma_telefon1` varchar(50) DEFAULT NULL,
  `firma_telefon2` varchar(50) DEFAULT NULL,
  `firma_mail1` varchar(150) DEFAULT NULL,
  `firma_mail2` varchar(150) DEFAULT NULL,
  `firma_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`firma_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of firmalar
-- ----------------------------
INSERT INTO `firmalar` VALUES ('1', null, 'Eksen Bilgisayar', null, null, null, null, null, null);
INSERT INTO `firmalar` VALUES ('2', null, 'Nova Bilgisayar', null, null, null, null, null, null);
INSERT INTO `firmalar` VALUES ('3', '1', 'deneme', '2234234', '234234', '4234234', '234234', '23423', '2016-07-27 13:03:12');

-- ----------------------------
-- Table structure for ids
-- ----------------------------
DROP TABLE IF EXISTS `ids`;
CREATE TABLE `ids` (
  `ids_id` int(11) NOT NULL AUTO_INCREMENT,
  `ids_sub_id` int(11) DEFAULT NULL,
  `ids_adi` varchar(50) DEFAULT NULL,
  `ids_soyadi` varchar(50) DEFAULT NULL,
  `ids_kadi` varchar(50) DEFAULT NULL,
  `ids_sifre` varchar(50) DEFAULT NULL,
  `ids_mail` varchar(100) DEFAULT NULL,
  `ids_telefon` varchar(50) DEFAULT NULL,
  `ids_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ids_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ids
-- ----------------------------
INSERT INTO `ids` VALUES ('1', '1', 'Gül', 'Gül', 'ids', '81dc9bdb52d04dc20036dbd8313ed055', 'ids@ids.com.tr', '05556664477', '2016-07-28 11:12:45');

-- ----------------------------
-- Table structure for ilceler
-- ----------------------------
DROP TABLE IF EXISTS `ilceler`;
CREATE TABLE `ilceler` (
  `ilce_id` int(11) NOT NULL AUTO_INCREMENT,
  `ilce_il_id` int(11) DEFAULT NULL,
  `ilce_adi` varchar(50) DEFAULT NULL,
  `ilce_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ilce_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ilceler
-- ----------------------------
INSERT INTO `ilceler` VALUES ('1', '1', 'Avcılar', '2016-07-19 22:29:56');
INSERT INTO `ilceler` VALUES ('2', '1', 'Beşiktaş', '2016-07-19 22:30:16');
INSERT INTO `ilceler` VALUES ('3', '4', 'Merkez', '2016-07-27 10:55:01');

-- ----------------------------
-- Table structure for kategoriler
-- ----------------------------
DROP TABLE IF EXISTS `kategoriler`;
CREATE TABLE `kategoriler` (
  `kat_id` int(11) NOT NULL AUTO_INCREMENT,
  `kat_adi` varchar(100) DEFAULT NULL,
  `kat_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`kat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kategoriler
-- ----------------------------
INSERT INTO `kategoriler` VALUES ('1', 'Elektronik Cihaz', '2016-07-27 12:48:57');

-- ----------------------------
-- Table structure for personeller
-- ----------------------------
DROP TABLE IF EXISTS `personeller`;
CREATE TABLE `personeller` (
  `personel_id` int(11) NOT NULL AUTO_INCREMENT,
  `personel_adi` varchar(100) DEFAULT NULL,
  `personel_soyadi` varchar(100) DEFAULT NULL,
  `personel_telefon` varchar(100) DEFAULT NULL,
  `personel_mail` varchar(150) DEFAULT NULL,
  `personel_sube_id` int(11) DEFAULT NULL,
  `personel_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`personel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personeller
-- ----------------------------
INSERT INTO `personeller` VALUES ('1', 'Serkan', 'Kaya', '555 555 55 55', 'serkankayatr@hotmail.com', '1', '2016-07-21 12:31:47');
INSERT INTO `personeller` VALUES ('2', 'Hakan', 'Özer', '532 444 44 44', 'hakanozer02@gmail.com', '1', '2016-07-21 12:32:38');

-- ----------------------------
-- Table structure for sehirler
-- ----------------------------
DROP TABLE IF EXISTS `sehirler`;
CREATE TABLE `sehirler` (
  `sehir_id` int(11) NOT NULL AUTO_INCREMENT,
  `sehir_adi` varchar(50) DEFAULT NULL,
  `sehir_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sehir_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sehirler
-- ----------------------------
INSERT INTO `sehirler` VALUES ('1', 'İstanbul', '2016-07-19 22:28:41');
INSERT INTO `sehirler` VALUES ('2', 'Ankara', '2016-07-19 22:28:42');
INSERT INTO `sehirler` VALUES ('3', 'İzmir', '2016-07-19 22:29:01');
INSERT INTO `sehirler` VALUES ('4', 'Adana', '2016-07-27 10:54:50');

-- ----------------------------
-- Table structure for subeler
-- ----------------------------
DROP TABLE IF EXISTS `subeler`;
CREATE TABLE `subeler` (
  `sube_id` int(11) NOT NULL AUTO_INCREMENT,
  `sube_adi` varchar(255) DEFAULT NULL,
  `sube_sehir_id` int(11) DEFAULT NULL,
  `sube_ilce_id` int(11) DEFAULT NULL,
  `sube_adres` varchar(255) DEFAULT NULL,
  `sube_telefon` varchar(50) DEFAULT NULL,
  `sube_ids` int(11) DEFAULT NULL,
  `sube_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sube_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subeler
-- ----------------------------
INSERT INTO `subeler` VALUES ('1', 'Üniversite Şubesi', '1', '1', 'Üniversite Mahallesi', '5553322', null, '2016-07-24 00:57:21');

-- ----------------------------
-- Table structure for teklifler
-- ----------------------------
DROP TABLE IF EXISTS `teklifler`;
CREATE TABLE `teklifler` (
  `teklif_id` int(11) NOT NULL AUTO_INCREMENT,
  `teklif_adi` varchar(255) DEFAULT NULL,
  `teklif_tekliflistesi_id` int(11) DEFAULT NULL,
  `teklif_firma_id` int(11) DEFAULT NULL,
  `teklif_aciklama` varchar(255) DEFAULT NULL,
  `teklif_urun_adedi` int(11) DEFAULT NULL,
  `teklif_fiyati` double(11,2) DEFAULT NULL,
  `teklif_onay_durumu` enum('Onay Bekliyor','Onay','Red') DEFAULT NULL,
  `teklif_turu` enum('Zimmet','Demirbaş') DEFAULT NULL,
  `teklif_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`teklif_id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teklifler
-- ----------------------------
INSERT INTO `teklifler` VALUES ('156', 'pc', '130', '1', 'sdsd', '1', '1.00', 'Onay Bekliyor', 'Zimmet', '2016-07-27 12:48:10');
INSERT INTO `teklifler` VALUES ('157', 'pc', '130', '2', '3434', '1', '2.00', 'Onay Bekliyor', 'Zimmet', '2016-07-27 12:48:15');

-- ----------------------------
-- Table structure for tekliflistesi
-- ----------------------------
DROP TABLE IF EXISTS `tekliflistesi`;
CREATE TABLE `tekliflistesi` (
  `tekliflistesi_id` int(11) NOT NULL AUTO_INCREMENT,
  `tekliflistesi_adi` varchar(150) DEFAULT NULL,
  `tekliflistesi_aciklama` text,
  `tekliflistesi_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `tekliflistesi_durum` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`tekliflistesi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tekliflistesi
-- ----------------------------
INSERT INTO `tekliflistesi` VALUES ('130', 'pc', '<html>\n  <head>\n    \n  </head>\n  <body>\n    Nova Bilgisayar isimli Firman&#305;n pc isimli teklif i&#231;in teklifi =2 TL, Eksen \n    Bilgisayar isimli Firman&#305;n pc isimli teklif i&#231;in teklifi =1 TL\n  </body>\n</html>\n', '2016-07-27 12:48:18', '0');
INSERT INTO `tekliflistesi` VALUES ('133', 'Hp Bilgisayar', '<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n      \n    </p>\n  </body>\n</html>\n', '2016-07-28 11:14:21', '0');

-- ----------------------------
-- Table structure for urunler
-- ----------------------------
DROP TABLE IF EXISTS `urunler`;
CREATE TABLE `urunler` (
  `urun_id` int(11) NOT NULL AUTO_INCREMENT,
  `urun_adi` varchar(50) DEFAULT NULL,
  `urun_aciklama` varchar(255) DEFAULT NULL,
  `urun_kat_id` int(11) DEFAULT NULL,
  `urun_stok` int(11) DEFAULT NULL,
  `urun_turu` enum('zimmet','demirbas') DEFAULT NULL,
  `urun_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`urun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of urunler
-- ----------------------------
INSERT INTO `urunler` VALUES ('1', 'Acer Notebook', 'I3 işlemcili', null, '50', 'zimmet', '2016-07-20 22:20:45');
INSERT INTO `urunler` VALUES ('2', 'Masa', '4 ayak', null, '10', 'demirbas', '2016-07-20 22:20:47');
INSERT INTO `urunler` VALUES ('3', 'Sandalye', 'kaliteli', null, '5', 'demirbas', '2016-07-20 22:20:51');
INSERT INTO `urunler` VALUES ('4', 'Su Isıtıcısı', 'Orta', null, '2', 'demirbas', '2016-07-20 22:20:53');
INSERT INTO `urunler` VALUES ('5', 'Buzdolabı', 'Samsung', null, '1', 'demirbas', '2016-07-20 22:20:58');

-- ----------------------------
-- Table structure for zimmetler
-- ----------------------------
DROP TABLE IF EXISTS `zimmetler`;
CREATE TABLE `zimmetler` (
  `zim_id` int(11) NOT NULL AUTO_INCREMENT,
  `zim_urun_id` int(11) DEFAULT NULL,
  `zim_sube_id` int(11) DEFAULT NULL,
  `zim_personel_id` int(11) DEFAULT NULL,
  `zim_urun_adet` int(11) DEFAULT NULL,
  `zim_tarih` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`zim_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zimmetler
-- ----------------------------
INSERT INTO `zimmetler` VALUES ('1', '1', '1', '1', '5', '2016-07-21 21:42:56');
INSERT INTO `zimmetler` VALUES ('2', '2', '1', '2', '2', '2016-07-21 21:46:31');
INSERT INTO `zimmetler` VALUES ('3', '3', '1', '1', '6', null);

-- ----------------------------
-- Procedure structure for salla
-- ----------------------------
DROP PROCEDURE IF EXISTS `salla`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `salla`(IN `dd` varchar(500))
BEGIN
	

select urun.urun_adi as x,demir.demirbas_urun_adet as y from demirbaslar as demir LEFT JOIN subeler as sube on sube.sube_id=demir.demirbas_sube_id LEFT JOIN ilceler as ilce on sube.sube_ilce_id=ilce.ilce_id LEFT JOIN urunler as urun on demir.demirbas_urun_id=urun.urun_id where ilce.ilce_adi=dd;

END
;;
DELIMITER ;
