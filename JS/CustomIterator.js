/*
 * This is a JavaScript Scratchpad.
 *
 * Enter some JavaScript, then Right Click or choose from the Execute Menu:
 * 1. Run to evaluate the selected text (Ctrl+R),
 * 2. Inspect to bring up an Object Inspector on the result (Ctrl+I), or,
 * 3. Display to insert the result in a comment after the selection. (Ctrl+L)
 */


function makeRangeIterator(start=0,end=infinity,step=1){
  let nextIndex=start;
  let iterationCount=0;
  
  const rangeIterator={
    next:function(){
      let result;
      if(nextIndex<end){
        result={value:nextIndex,done:false};
        nextIndex+=step;
        iterationCount++;
        return result;
      }
      return {value: iterationCount,done:true};
    }
  }
  return rangeIterator;
}

let it=makeRangeIterator(1,10,2);
let result=it.next();
while(!result.done){
  console.log(result.value);
  result=it.next();
}