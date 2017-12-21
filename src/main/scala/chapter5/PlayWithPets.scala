/*
 * Copyright 2017 pragmatic-scala.reactiveplatform.xyz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package chapter5

object PlayWithPets extends App {
  class Pet(val name: String) {
    override def toString: String = name
  }

  class Dog(override val name: String) extends Pet(name)

  def workWithPets(pets: Array[Pet]): Unit = {}

  def playWithPets[T <: Pet](pets: Array[T]): Unit =
    println("Playing with pets: " + pets.mkString(", "))

  val dogs = Array(new Dog("Rover"), new Dog("Comet"))
  /*
  workWithPets(dogs) // Compilation ERROR
  */

  playWithPets(dogs)

  def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]): Unit = { //...
  }

  val pets = new Array[Pet](10)
  copyPets(dogs, pets)

}
