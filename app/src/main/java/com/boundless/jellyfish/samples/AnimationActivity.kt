package com.boundless.jellyfish.samples

import android.app.Activity
import android.os.Bundle
import com.boundless.jellyfish.converttokotlin.calculateNewCoordinate
import com.boundless.jellyfish.converttokotlin.randomAngleInRadians
import com.boundless.jellyfish.converttokotlin.reverseDirectionWithRadians

class AnimationActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    moveCoordinate()
    reverseDirection()
    createRectangle()
  }

  private fun moveCoordinate() {
    val start = Coordinate(0.0, 0.0)
    val newCoordinate = calculateNewCoordinate(start, randomAngleInRadians(), 10.0)
  }

  private fun reverseDirection() {
    val currentDirection = randomAngleInRadians()
    val newDirection = reverseDirectionWithRadians(currentDirection)
  }

  private fun createRectangle() {
    val center = Coordinate(50.0, 50.0)
    val rectangle = Rectangle(10.0, 10.0, center)
  }
}
