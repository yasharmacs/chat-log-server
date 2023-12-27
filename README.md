//curl for post

curl --location 'localhost:9090/chatlogs/abcde1234' \
--header 'Content-Type: application/json' \
--data '{
    "message": "hey how you doing",
    "timestamp": 1672531200000,
    "isSent": true
}'

//curl for get all messages for user

curl --location 'localhost:9090/chatlogs/abcde1234' \
--header 'Content-Type: application/json'

//curl to delete all chat message log for user

curl --location --request DELETE 'localhost:9090/chatlogs/abcde1234' \
--header 'Content-Type: application/json'

//curl to delete specific message id fro user

curl --location --request DELETE 'localhost:9090/chatlogs/abcde1234/sdfasf-sadfasdf-asdfas-asfd' \
--header 'Content-Type: application/json'

