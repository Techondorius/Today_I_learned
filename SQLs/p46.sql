SELECT 商品名, SUM(数量)
FROM 売上データ
LEFT JOIN 商品マスタ ON 売上データ.商品ID = 商品マスタ.商品ID
GROUP BY 売上データ.商品ID;