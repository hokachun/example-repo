SELECT
  owner_id,
  owner_name,
  COUNT(DISTINCT category_article_mapping.category_id) AS different_category_count
FROM
  owner
  LEFT JOIN article ON owner.owner_id = article.owner_id
  LEFT JOIN category_article_mapping on article.article_id = category_article_mapping.article_id
  LEFT JOIN category ON category_article_mapping.category_id = category.category_id
ORDER BY
  COUNT(DISTINCT category_article_mapping.category_id)