package com.boundless.jellyfish.converttokotlin

import com.boundless.k

fun convertRgbToHex(rgbColor: RgbColor): HexColor {
  val hexRed = String.format("%02x", rgbColor.red)
  val hexGreen = String.format("%02x", rgbColor.green)
  val hexBlue = String.format("%02x", rgbColor.blue)
  return HexColor.create(hexRed, hexGreen, hexBlue)
}

fun generateRandomRgb(): RgbColor {
  return RgbColor.createFromAbsolutes(
      randomNumberInRange(0, 256),
      randomNumberInRange(0, 256),
      randomNumberInRange(0, 256)
  )
}