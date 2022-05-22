-- SQL問題1
SELECT 商品名, SUM(数量)
FROM 商品マスタ
LEFT OUTER JOIN 売上データ ON 商品マスタ.商品ID = 売上データ.商品ID
AND 処理日 BETWEEN '2006-04-01' AND '2006-04-30'
GROUP BY 商品名;