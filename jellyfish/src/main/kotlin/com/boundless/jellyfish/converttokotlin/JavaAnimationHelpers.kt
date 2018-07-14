package com.boundless.jellyfish.converttokotlin

fun reverseDirectionWithRadians(radians: Double): Double {
  if (radians < 0.0 || radians > 6.2832)
    throw RuntimeException("Radians invalid. Received $radians but must be in range 0-6.283")


  val degrees = Math.toDegrees(radians)
  return Math.toRadians(reverseDirectionWithDegrees(degrees))
}