package ca.levimiller.voicebridge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VoiceBridgeApplication {}

fun main(args: Array<String>) {
	runApplication<VoiceBridgeApplication>(*args)
}
