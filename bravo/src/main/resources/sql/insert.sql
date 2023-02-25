USE bravodb;

INSERT INTO mst_category(category_name, category_description) VALUES('置物', '机に置いて楽しみます。');

INSERT INTO mst_category(category_name, category_description) VALUES('クッション', 'クッションです。');

INSERT INTO mst_category(category_name, category_description) VALUES('キッチン用品', 'ユニークなキッチン用品です。');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('置き時計', 'おきどけい', '時間を確認しながら楽しめるデザインの置き時計です。', 1, 1000, '/img/clock.png', '2020年10月5日', '合同会社ギアギア');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('スタンドライト', 'すたんどらいと', '空間の演出に欠かせません。', 1, 3500, '/img/stand-light.png', '2020年1月15日', '合同会社ライト');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('チェック柄クッション', 'ちぇっくがらくっしょん', '座り心地の良いクッションです。', 2, 2500, '/img/stripe-cushion.png', '2000年4月5日', '株式会社マサイ');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('円形クッション', 'えんけいくっしょん', '丸い形が特徴のクッションです。', 2, 2000, '/img/round-cushion.png', '2008年3月3日', 'もふもふコーポレーション');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('ベーキングセット', 'べーきんぐせっと', 'パイを焼いたり、特徴的な型の模様をつけて楽しむことができます。', 3, 5000, '/img/baking-set.png', '1988年10月3日', '株式会社あんぱん');

INSERT INTO mst_product(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) 
VALUES ('コーヒーマグカップ', 'こーひーまぐかっぷ', '職人が細部にこだわって焼いたコーヒーマグカップです。眺めているだけでどこか懐かしい気持ちになることができます。', 3, 2000, '/img/coffee-mug.png', '2011年8月8日', '株式会社職人');
