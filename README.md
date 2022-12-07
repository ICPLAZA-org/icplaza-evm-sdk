## icplaza evm sdk
### example: sign a transfer message
> my json data

> keys in "msgs value(note the order: amount, from_address, to_address)" block must sort by alphabetical order
```json
{
    "chain_id": "icplaza_9000-4",
    "fee": {
        "amount": [
            {
                "amount": "5000",
                "denom": "uict"
            }
        ],
        "gas": "200000"
    },
    "sequence": "2",
    "msgs": [
        {
            "type": "cosmos-sdk/MsgSend",
            "value": {
                "amount": [
                    {
                        "denom": "uict",
                        "amount": "1000000000"
                    }
                ],
                "from_address": "icplaza103vzr6d7crmyvun2uk5jk0dt5wu7j0yynvzu0g",
                "to_address": "icplaza1434f9udjqmcgc9xtf9tdap34ml42wgdpz3xkyd"
            }
        }
    ],
    "memo": "",
    "account_number": "0"
}
```
> code snippets
```java
String unSignedMsg = "my json data above";
//change to your private key assoctiated with from_address
String privateKey = "930a1a4a2ef2d8184b5ad89b4fc67f4daa1945e16b386d99655af45f2444abf3";
String signedMsg = Transaction.signJson(json, privateKey);
```
> after signature
```json
{
    "mode": "sync",
    "tx": {
        "memo": "",
        "msg": [
            {
                "type": "cosmos-sdk/MsgSend",
                "value": {
                    "amount": [
                        {
                            "amount": "1000000000",
                            "denom": "uict"
                        }
                    ],
                    "from_address": "icplaza103vzr6d7crmyvun2uk5jk0dt5wu7j0yynvzu0g",
                    "to_address": "icplaza1434f9udjqmcgc9xtf9tdap34ml42wgdpz3xkyd"
                }
            }
        ],
        "fee": {
            "amount": [
                {
                    "amount": "5000",
                    "denom": "uict"
                }
            ],
            "gas": "200000"
        },
        "signatures": [
            {
                "pub_key": {
                    "type": "ethermint/PubKeyEthSecp256k1",
                    "value": "As74hrwvu/ERFAP0UXym8vHEekvzV4lWrc7XmYLbZCu0"
                },
                "signature": "r/pxn7KYe3zdDzZLiZv9b9n7eK3vBKekWSUOylkZVONA5kjODTvmHvBZUeKMB5vi2yNK5MAqW6E7e8DwJGOBHwE="
            }
        ],
        "type": "auth/StdTx"
    }
}
```