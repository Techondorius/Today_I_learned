-- MySQLだとDATE_FORMATが必要
-- 参考: https://www.dbonline.jp/mysql/function/index49.html

SELECT DATE_FORMAT(処理日, '%Y %M'), COUNT(*)
FROM 売上データ
GROUP BY DATE_FORMAT(処理日, '%Y %M');
