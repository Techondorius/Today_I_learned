/*
 * テーブル作成スクリプト(SQL Server 版)
 *
 * SQL Server 7.0 + Service Pack 2 で動作確認
 */

-- テーブル作成：商品マスタ
CREATE TABLE 商品マスタ (
    商品ID     NUMERIC NOT NULL,
    商品名     VARCHAR(30) NOT NULL,
    グループ名 VARCHAR(20) NOT NULL,
    仕入単価   NUMERIC,
    卸単価     NUMERIC,
    CONSTRAINT pk_shohin PRIMARY KEY (商品ID)
);

-- テーブル作成：担当者マスタ
CREATE TABLE 担当者マスタ (
    担当者ID   NUMERIC NOT NULL,
    担当者名   VARCHAR(20) NOT NULL,
    ふりがな   VARCHAR(20) NOT NULL,
    MGR_ID     NUMERIC,
    生年月日   DATETIME NOT NULL,
    性別       NUMERIC NOT NULL,
    CONSTRAINT pk_tanto PRIMARY KEY (担当者ID),
    CONSTRAINT fk_mgr FOREIGN KEY (MGR_ID) REFERENCES 担当者マスタ(担当者ID),
    CONSTRAINT ck_gender CHECK (性別=0 OR 性別=1)
);

-- テーブル作成：顧客マスタ
CREATE TABLE 顧客マスタ (
    顧客ID     NUMERIC NOT NULL,
    顧客名     VARCHAR(20) NOT NULL,
    連絡先     VARCHAR(20) NOT NULL,
    CONSTRAINT pk_kokyaku PRIMARY KEY (顧客ID)
);

-- テーブル作成：売上データ
CREATE TABLE 売上データ (
    伝票番号   NUMERIC NOT NULL,
    行番号     NUMERIC NOT NULL,
    処理日     DATETIME NOT NULL,
    商品ID     NUMERIC NOT NULL,
    担当者ID   NUMERIC NOT NULL,
    顧客ID     NUMERIC NOT NULL,
    数量       NUMERIC NOT NULL,
    CONSTRAINT pk_uriage PRIMARY KEY (伝票番号, 行番号),
    CONSTRAINT fk_shohin FOREIGN KEY (商品ID) REFERENCES 商品マスタ(商品ID),
    CONSTRAINT fk_tanto FOREIGN KEY (担当者ID) REFERENCES 担当者マスタ(担当者ID),
    CONSTRAINT fk_kokyaku FOREIGN KEY (顧客ID) REFERENCES 顧客マスタ(顧客ID)
);

-- テーブル作成：支店担当者マスタ
CREATE TABLE 支店担当者マスタ (
    支店担当者ID   NUMERIC NOT NULL,
    支店担当者名   VARCHAR(20) NOT NULL,
    ふりがな   VARCHAR(20) NOT NULL,
    MGR_ID     NUMERIC,
    生年月日   DATETIME NOT NULL,
    性別       NUMERIC NOT NULL,
    CONSTRAINT pk_siten_tanto PRIMARY KEY (支店担当者ID),
    CONSTRAINT fk_siten_mgr FOREIGN KEY (MGR_ID) REFERENCES 支店担当者マスタ(支店担当者ID),
    CONSTRAINT ck_siten_gender CHECK (性別=0 OR 性別=1)
);
