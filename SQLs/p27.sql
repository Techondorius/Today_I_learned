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
