package com.graphene.kafka.connect.prometheus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrometheusSourceConnectorApplication

fun main(args: Array<String>) {
  runApplication<PrometheusSourceConnectorApplication>(*args)
}
