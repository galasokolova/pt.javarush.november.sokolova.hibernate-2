# Improvements should be done

## "film_text"

1. The table "film_text" isn't connected to the table "film", so it has to get a foreign key;

## "address"

1. The table "address" is better to make embedded;

## "film"

1. The column "original_language_id" should not be nullable as a film always has an original language;
2. The column "special_features" has several values per one film_id, is better to create an embedded table as one film can have several special features;