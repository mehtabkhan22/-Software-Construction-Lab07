/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

public class DataBox<T> {

    private T value;

    public DataBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
