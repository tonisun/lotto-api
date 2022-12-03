# Lotto API
![Logo](src/main/resources/images/logo.png)

[(http://localhost:8080/api/](http://localhost:8080/api/)

```JSON
{
  "_links" : {
    "euroJackpotRows" : {
      "href" : "http://localhost:8080/api/euroJackpotRows{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile"
    }
  }
}
```

[http://localhost:8080/api/euroJackpotRows/1](http://localhost:8080/api/euroJackpotRows/1)
```JSON
{
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
}
```

[http://localhost:8080/api/euroJackpotRows/2118760](http://localhost:8080/api/euroJackpotRows/2118760)
```JSON
{
  "number1" : 46,
  "number2" : 47,
  "number3" : 48,
  "number4" : 49,
  "number5" : 50,
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/api/euroJackpotRows/2118760"
    },
    "euroJackpotRow" : {
      "href" : "http://localhost:8080/api/euroJackpotRows/2118760"
    }
  }
}
```


[http://localhost:8080/api/euroJackpotRows](http://localhost:8080/api/euroJackpotRows)
```JSON
{
  "_embedded" : {
    "euroJackpotRows" : [ {
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
