import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'custom'
})
export class CustomPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {

    let moddedString = value as string //casting parameter as a String

    //this method must return the transformed value
    return moddedString.concat(' plus a transformation');
  }

}
