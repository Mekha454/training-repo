const utils = require("../index.js");

describe("MyJSUtilities", function() { 
    describe("String Utils", function() { 
        it("should be able to lower case a string",function() { expect(utils.toLowerCase).toBeDefined(); 
            expect(utils.toLowerCase("HELLO WORLD")).toEqual("hello world"); });  
        it("should be able to upper case a string",function() { 
            var spytoUpperCase = spyOn(String.prototype, 'toUpperCase').and.callThrough();
            expect(utils.toUpperCase).toBeDefined(); 
            expect(utils.toUpperCase("hello world")).toEqual("HELLO WORLD"); 
            expect(String.prototype.toUpperCase).toHaveBeenCalled(); expect(spytoUpperCase.calls.count()).toEqual(1);
        });  
        it("should be able to confirm if a string contains a substring",function() { expect(utils.contains).toBeDefined(); 
            expect(utils.contains("hello world","hello",0)).toBeTruthy(); });  
        it("should be able repeat a string multiple times",function() { expect(utils.repeat).toBeDefined(); 
            expect(utils.repeat("hello", 3)).toEqual("hellohellohello");  });
    });
   
describe("Math Utils", function() { 
    describe("Basic Math Utils", function() {beforeEach(function () {jasmine.addMatchers({hasEvenMethod: function (util, customEqualityTesters) 
        {return {compare:  function (actual, expected) {var  result  = { pass:  utils.isEven  !==  undefined };
            if (result.pass) {result.message  = "Expected isEven() to be not defined."}
            else {result.message  =  "Expected isEven() to be defined."}
            return  result;}}}});});
        it("should be able to tell if a number is even",function() { expect().hasEvenMethod(); 
            expect(utils.isEven(2)).toBeTruthy(); expect(utils.isEven(1)).toBeFalsy(); });     
        it("should be able to tell if a number is odd",function() { expect(utils.isOdd).toBeDefined(); 
            expect(utils.isOdd(1)).toBeTruthy(); expect(utils.isOdd(2)).toBeFalsy(); });     
     
 
    describe("Advanced Math Utils", function() {  
        it("should be able to tell if a number is prime",function() { expect().nothing();});   
        it("should be able to calculate the fibonacci of a number",function() { expect().nothing(); }); 
    }); 
});
});

describe("/Async Op", function() {var asyncOpCompleted = false; beforeEach(function (done) {utils.simulateAsyncOp(function(){ asyncOpCompleted = true; done();});});
    it("should be able to tell if the async call has completed", function () { expect(asyncOpCompleted).toEqual(true);});
    it("should work with async/await", async () => { let completed = false; completed = await utils.simulateAsyncOp(); expect(completed).toEqual(true); });});
});

