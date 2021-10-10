class Solution {
public:
    bool isValid(string s) {
        if(s.empty()) return true;
        stack<char>paren;
        for(char c : s)
        {
            if(c=='[' || c == '{' || c == '(')
                paren.push(c);// when c is open bracket
            else
            {   //when c= ] || } || )
                if(!paren.empty() && Match(paren.top(),c))
                    paren.pop();
                else
                    return false;
            }
        }
        if(paren.empty()) //Stack must be empty for valid parentheses
            return true;
        return false;
    }
private:
    bool Match(char a, char b)
    {   // Corresponding bracket
        if((a =='[' && b ==']') || (a == '{' && b =='}') || (a == '(' && b == ')'))
            return true;
        return false;
            
    }
};

Time Compexity : O(n)
Approach :If the character is open parentheses push it into the stack
else
Check the top of stack and the current char are valid or not
If valid then pop char from stack
else return false
After the loop again check the stack is empty or not
If empty then return true
return false
