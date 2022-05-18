-- 演習問題

-- 問題1
SELECT 担当者名, 処理日, 商品名
FROM 売上データ
INNER JOIN 商品マスタ ON 売上データ.商品ID = 商品マスタ.商品ID
INNER JOIN 担当者マスタ ON 売上データ.担当者ID = 担当者マスタ.担当者ID;

-- 問題2
SELECT 処理日, 商品名
FROM 売上データ
INNER JOIN 商品マスタ ON 売上データ.商品ID = 商品マスタ.商品ID
INNER JOIN 担当者マスタ ON 売上データ.担当者ID = 担当者マスタ.担当者ID
WHERE 担当者名 = '鈴木';

-- 問題3
SELECT 商品名, 担当者名
FROM 売上データ
INNER JOIN 商品マスタ ON 売上データ.商品ID = 商品マスタ.商品ID
INNER JOIN 担当者マスタ ON 売上データ.担当者ID = 担当者マスタ.担当者ID
INNER JOIN 顧客マスタ ON 売上データ.顧客ID = 顧客マスタ.顧客ID
WHERE 処理日 >= '2006-05-01' AND 処理日 <= '2006-5-31' AND 顧客名="（株）ワイキキソフト";