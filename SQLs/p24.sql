-- INNER JOINとか
-- "売上データ."がないと売上データと商品マスタの売上IDが両方重複してだめ

SELECT 処理日, 売上データ.商品ID, 商品名
FROM 売上データ INNER JOIN 商品マスタ ON 売上データ.商品ID = 商品マスタ.商品ID;