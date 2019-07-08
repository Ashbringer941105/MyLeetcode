package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
例如，在alice@leetcode.com中，alice是本地名称，leetcode.com是域名。

除了小写字母，这些电子邮件可能包含'。'或'+'。

如果在电子邮件地址的本地名称部分中的某些字符之间添加句点（'。'），则在那里发送的邮件将转发到本地名称中没有点的同一地址。例如，“alice.z@leetcode.com”和“alicez@leetcode.com”转发到同一电子邮件地址。 （请注意，此规则不适用于域名。）

如果在本地名称中添加加号（'+'），则会忽略第一个加号后面的所有内容。这允许过滤某些电子邮件，例如m.y+name@email.com将转发到my@email.com。 （同样，此规则不适用于域名。）

可以同时使用这两个规则。

给定电子邮件列表，我们会向列表中的每个地址发送一封电子邮件。有多少不同的地址实际接收邮件？
 */
public class UniqueEmailAddresses {
    public static void main(String[] args){

        String a = "111111+22222";
        a = a.split("\\+")[0];
        System.out.println(a);

    }
    public int numUniqueEmails(String[] emails) {
        Map<String,Integer> emailMap = new HashMap<String,Integer>();
        for(String email:emails){
            String[] arr = email.split("@");
            String localName = arr[0];
            String domainName = arr[1];
            localName = localName.replace(".","");
            localName = localName.split("[+]")[0];
            email = localName +"@" + domainName;
            emailMap.put(email,0);

        }

        return emailMap.size();
    }
}
