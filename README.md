# Lotto API
![Logo](src/main/resources/static/logo.png)

[http://localhost:8080/api/](http://localhost:8080/api/)

```JSON
{
  "_links" : {
    "euroJackpotRows" : {
      "href" : "http://localhost:8080/api/euroJackpotRows{?page,size,sort}",
      "templated" : true
    },
    "euroJackpotDraws" : {
      "href" : "http://localhost:8080/api/euroJackpotDraws{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile"
    }
  }
}
```

[http://localhost:8080/api/euroJackpotDraws](http://localhost:8080/api/euroJackpotDraws)
```JSON
{
  "_embedded" : {
    "euroJackpotDraws" : [ {
      "date" : "2012-03-23",
      "number1" : 5,
      "number2" : 46,
      "number3" : 37,
      "number4" : 21,
      "number5" : 8,
      "euroNumber1" : 8,
      "euroNumber2" : 6,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-03-23"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-03-23"
        }
      }
    }, {
      "date" : "2012-03-30",
      "number1" : 19,
      "number2" : 5,
      "number3" : 7,
      "number4" : 12,
      "number5" : 26,
      "euroNumber1" : 1,
      "euroNumber2" : 5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-03-30"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-03-30"
        }
      }
    }, {
      "date" : "2012-04-06",
      "number1" : 36,
      "number2" : 38,
      "number3" : 34,
      "number4" : 8,
      "number5" : 7,
      "euroNumber1" : 5,
      "euroNumber2" : 4,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-06"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-06"
        }
      }
    }, {
      "date" : "2012-04-13",
      "number1" : 12,
      "number2" : 27,
      "number3" : 32,
      "number4" : 5,
      "number5" : 11,
      "euroNumber1" : 3,
      "euroNumber2" : 1,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-13"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-13"
        }
      }
    }, {
      "date" : "2012-04-20",
      "number1" : 30,
      "number2" : 16,
      "number3" : 45,
      "number4" : 41,
      "number5" : 10,
      "euroNumber1" : 2,
      "euroNumber2" : 8,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-20"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-20"
        }
      }
    }, {
      "date" : "2012-04-27",
      "number1" : 40,
      "number2" : 13,
      "number3" : 10,
      "number4" : 19,
      "number5" : 45,
      "euroNumber1" : 3,
      "euroNumber2" : 5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-27"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-04-27"
        }
      }
    }, {
      "date" : "2012-05-04",
      "number1" : 29,
      "number2" : 45,
      "number3" : 41,
      "number4" : 35,
      "number5" : 30,
      "euroNumber1" : 5,
      "euroNumber2" : 3,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-04"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-04"
        }
      }
    }, {
      "date" : "2012-05-11",
      "number1" : 38,
      "number2" : 21,
      "number3" : 39,
      "number4" : 47,
      "number5" : 15,
      "euroNumber1" : 1,
      "euroNumber2" : 5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-11"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-11"
        }
      }
    }, {
      "date" : "2012-05-18",
      "number1" : 46,
      "number2" : 43,
      "number3" : 12,
      "number4" : 44,
      "number5" : 18,
      "euroNumber1" : 5,
      "euroNumber2" : 4,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-18"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-18"
        }
      }
    }, {
      "date" : "2012-05-25",
      "number1" : 32,
      "number2" : 11,
      "number3" : 41,
      "number4" : 26,
      "number5" : 4,
      "euroNumber1" : 5,
      "euroNumber2" : 7,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-25"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-05-25"
        }
      }
    }, {
      "date" : "2012-06-01",
      "number1" : 34,
      "number2" : 38,
      "number3" : 28,
      "number4" : 37,
      "number5" : 11,
      "euroNumber1" : 3,
      "euroNumber2" : 7,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-01"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-01"
        }
      }
    }, {
      "date" : "2012-06-08",
      "number1" : 44,
      "number2" : 36,
      "number3" : 10,
      "number4" : 16,
      "number5" : 15,
      "euroNumber1" : 7,
      "euroNumber2" : 8,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-08"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-08"
        }
      }
    }, {
      "date" : "2012-06-15",
      "number1" : 17,
      "number2" : 6,
      "number3" : 10,
      "number4" : 42,
      "number5" : 18,
      "euroNumber1" : 3,
      "euroNumber2" : 1,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-15"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-15"
        }
      }
    }, {
      "date" : "2012-06-22",
      "number1" : 14,
      "number2" : 49,
      "number3" : 16,
      "number4" : 47,
      "number5" : 13,
      "euroNumber1" : 1,
      "euroNumber2" : 7,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-22"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-22"
        }
      }
    }, {
      "date" : "2012-06-29",
      "number1" : 8,
      "number2" : 5,
      "number3" : 19,
      "number4" : 36,
      "number5" : 33,
      "euroNumber1" : 2,
      "euroNumber2" : 3,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-29"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-06-29"
        }
      }
    }, {
      "date" : "2012-07-06",
      "number1" : 38,
      "number2" : 22,
      "number3" : 24,
      "number4" : 10,
      "number5" : 33,
      "euroNumber1" : 6,
      "euroNumber2" : 2,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-06"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-06"
        }
      }
    }, {
      "date" : "2012-07-13",
      "number1" : 12,
      "number2" : 8,
      "number3" : 31,
      "number4" : 27,
      "number5" : 37,
      "euroNumber1" : 6,
      "euroNumber2" : 3,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-13"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-13"
        }
      }
    }, {
      "date" : "2012-07-20",
      "number1" : 9,
      "number2" : 13,
      "number3" : 25,
      "number4" : 6,
      "number5" : 14,
      "euroNumber1" : 8,
      "euroNumber2" : 1,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-20"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-20"
        }
      }
    }, {
      "date" : "2012-07-27",
      "number1" : 9,
      "number2" : 34,
      "number3" : 35,
      "number4" : 23,
      "number5" : 22,
      "euroNumber1" : 1,
      "euroNumber2" : 3,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-27"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-07-27"
        }
      }
    }, {
      "date" : "2012-08-03",
      "number1" : 12,
      "number2" : 25,
      "number3" : 24,
      "number4" : 18,
      "number5" : 15,
      "euroNumber1" : 4,
      "euroNumber2" : 5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-08-03"
        },
        "euroJackpotDraw" : {
          "href" : "http://localhost:8080/api/euroJackpotDraws/2012-08-03"
        }
      }
    } ]
  },
  "_links" : {
    "first" : {
      "href" : "http://localhost:8080/api/euroJackpotDraws?page=0&size=20"
    },
    "self" : {
      "href" : "http://localhost:8080/api/euroJackpotDraws"
    },
    "next" : {
      "href" : "http://localhost:8080/api/euroJackpotDraws?page=1&size=20"
    },
    "last" : {
      "href" : "http://localhost:8080/api/euroJackpotDraws?page=25&size=20"
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile/euroJackpotDraws"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 511,
    "totalPages" : 26,
    "number" : 0
  }
}
```

[http://localhost:8080/api/euroJackpotRows](http://localhost:8080/api/euroJackpotRows)
```JSON
{
  "_embedded" : {
    "euroJackpotRows" : [ {
      "id" : 1,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/1"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/1"
        }
      }
    }, {
      "id" : 2,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 6,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/2"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/2"
        }
      }
    }, {
      "id" : 3,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 7,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/3"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/3"
        }
      }
    }, {
      "id" : 4,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 8,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/4"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/4"
        }
      }
    }, {
      "id" : 5,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 9,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/5"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/5"
        }
      }
    }, {
      "id" : 6,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 10,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/6"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/6"
        }
      }
    }, {
      "id" : 7,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 11,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/7"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/7"
        }
      }
    }, {
      "id" : 8,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 12,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/8"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/8"
        }
      }
    }, {
      "id" : 9,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 13,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/9"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/9"
        }
      }
    }, {
      "id" : 10,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 14,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/10"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/10"
        }
      }
    }, {
      "id" : 11,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 15,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/11"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/11"
        }
      }
    }, {
      "id" : 12,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 16,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/12"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/12"
        }
      }
    }, {
      "id" : 13,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 17,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/13"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/13"
        }
      }
    }, {
      "id" : 14,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 18,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/14"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/14"
        }
      }
    }, {
      "id" : 15,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 19,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/15"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/15"
        }
      }
    }, {
      "id" : 16,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 20,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/16"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/16"
        }
      }
    }, {
      "id" : 17,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 21,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/17"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/17"
        }
      }
    }, {
      "id" : 18,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 22,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/18"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/18"
        }
      }
    }, {
      "id" : 19,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 23,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/19"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/19"
        }
      }
    }, {
      "id" : 20,
      "number1" : 1,
      "number2" : 2,
      "number3" : 3,
      "number4" : 4,
      "number5" : 24,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/20"
        },
        "euroJackpotRow" : {
          "href" : "http://localhost:8080/api/euroJackpotRows/20"
        }
      }
    } ]
  },
  "_links" : {
    "first" : {
      "href" : "http://localhost:8080/api/euroJackpotRows?page=0&size=20"
    },
    "self" : {
      "href" : "http://localhost:8080/api/euroJackpotRows"
    },
    "next" : {
      "href" : "http://localhost:8080/api/euroJackpotRows?page=1&size=20"
    },
    "last" : {
      "href" : "http://localhost:8080/api/euroJackpotRows?page=105937&size=20"
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile/euroJackpotRows"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 2118760,
    "totalPages" : 105938,
    "number" : 0
  }
}
```


