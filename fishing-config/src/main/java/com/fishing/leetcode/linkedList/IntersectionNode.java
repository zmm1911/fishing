package com.fishing.leetcode.linkedList;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sun.rmi.runtime.NewThreadAction;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/24 18:00
 **/
public class IntersectionNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode l1 = headA,l2 = headB;
        while (l1 != l2){
            l1 = (l1==null)?headB:l1.next;
            l2 = (l2==null)?headA:l2.next;
        }
        return l1;
    }

    @Setter
    @Getter
    @ToString
    static
    class Cource {
        Cource(String id,String value){
            this.id = id;
            this.value = value;
        }
        String id;
        String value;

    }

    public static void main(String[] args) throws InterruptedException {


        List<Cource> list = new ArrayList<>();
        list.add(new Cource("1300-Week 30-  Under My Umbrella", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/f736b67444e84ac28c5f235c284e854d/"));
        list.add(new Cource("1300-Week 31-  Kites in Flight", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/ae06be724d9845cf81796d83f4e427d5/"));
        list.add(new Cource("1300-Week 32-  Day and Night", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/2c66965c3828471c9ec225d42f42f349/"));
        list.add(new Cource("1300-Week 33-  Mission to the Moon", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/4b021190841f46aabb140c92b20383d3/"));
        list.add(new Cource("1300-Week 44- Sail Away", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/84ec960e1e674f17ac0f6dd036d75712/"));
        list.add(new Cource("1300-Week 45- Sea Sand and Me!", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/8c36a312d2d34cf09d447f697f4e0eca/"));
        list.add(new Cource("1300-Week 46- I Wish I Was a Fish", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/6356788b182d437fbe92dfaa11268920/"));
        list.add(new Cource("1300-Week 47- Treasures of the Sea", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/f782a6fdeed9413a95afe3f7fbeb42de/"));
        list.add(new Cource("1300-Week 48- Red Hot Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/ef46e3ffc3ef44b8b08287ac98499dcc/"));
        list.add(new Cource("1300-Week 49- Summer Sensation", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/97b5c866047d4772b3a75e8552c87d92/"));
        list.add(new Cource("1300 Week 34  Pet Parade", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/4b01cda0a90b408294abbcf06e7086cc/"));
        list.add(new Cource("1300 Week 35  Life on the Farm", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/3b0bd21667ee4b249ca4afc648c8925a/"));
        list.add(new Cource("1300 Week 36  Zoom to the Zoo", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/dba9a5c43d8f4ff2b7948b9ef9f40964/"));
        list.add(new Cource("1300 Week 37  Under the Big Top", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/8b6296dd52bc43bd830b0288f2e43aa1/"));
        list.add(new Cource("1300 Week 38  Picnic Time", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/658dcaf21c154f14b8b44e13f73a3787/"));
        list.add(new Cource("1300 Week 50 Pink Lemonade", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/4538cc3ba28748f781eb24600c45540b/"));
        list.add(new Cource("1300 Week 51 Rainbow on My Plate", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/15d6386f61074da4a8bf7f273ce0ab24/"));
        list.add(new Cource("1300 Week 52 Super Summer Stories", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/b67a789ce7684f68be14ac27053e6c2a/"));
        list.add(new Cource("1300 Week 17  Toy Workshop", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/9fa4437b0dc7405e876a5d1798202a72/"));
        list.add(new Cource("1300 Week 18  Count the Candles", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/fb44cdcdf86d4423a122e60d83b7b2a8/"));
        list.add(new Cource("1300 Week 21 - Wonderful Winter", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/2e55c89480754f93a050275df6773356/"));
        list.add(new Cource("1300 Week 22 -  Matching Mittens", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/498241c1273140e4986dc8912d0d92f4/"));
        list.add(new Cource("1300 Week 39 - Gather 'Round the Campfire", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/531e18e76212448abac71572c1322e96/"));
        list.add(new Cource("1300 Week 40 - Growing Tall in the Garden", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/10c70b26e3cf40ed835f03037cda8074/"));
        list.add(new Cource("1300 Week 41 - Creeping Though the Garden", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/b735b5736f4d4a1ebf444610865dbad2/"));
        list.add(new Cource("1300 Week 42 - Butterfly Wings", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/f740cf95fdc44d6cad2484c455d97b94/"));
        list.add(new Cource("1300 Week 19 - The Adventures of Toot and Puddle", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/96401e9c3d674582b4ef520a3ceb594f/"));
        list.add(new Cource("1300 Week 20 - Jack and Jill Around the World", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/463727d220a4468bbf8d2f1cd26be37e/"));
        list.add(new Cource("1300 Week 9 - What's in a Tree", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/450c60a89c7e444e86cf30d8b370c068/"));
        list.add(new Cource("1300 Week 10 - Autumn Colors", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/945c86c3c3bc4d149c54b1d792d6d6e5/"));
        list.add(new Cource("1300 Week 23 Snowy Day Fun", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/fcfbae50bafe4e1aa8773fd95c5452d6/"));
        list.add(new Cource("1300 Week 24 Inside an Igloo", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/a599c81c3d3c4b25998ed73172887640/"));
        list.add(new Cource("1300 Week 25 Shh! Don't Wake the Bears!", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/ec60c9b4a820457792d27eb961490d61/"));
        list.add(new Cource("1300 Week 26 How Do You Feel Today", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/8c2d784faaf04931a04d46508179e749/"));
        list.add(new Cource("1300 Week 5 People at Work", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/46d8dcd33b264cc6bb074664f570d1b0/"));
        list.add(new Cource("1300 Week 6 At the Fire Station", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/ed2bfec3b6e84c5da3aa6fe2554af96b/"));
        list.add(new Cource("1300 Week 7 In the City", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/6e73b7ead97b4a1396b095bd2ae11cd5/"));
        list.add(new Cource("1300 Week 11 All About Apples", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/929e4551c93649f8aed8594c8b71b6ed/"));
        list.add(new Cource("1300 Week 12 Pumpkins on the Vine", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/644c20416c2142a4b744a82ba93a2378/"));
        list.add(new Cource("1300 Week 13  My Family", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/9bae977fec954adfbc573d105e3a4e0e/"));
        list.add(new Cource("1300 Week 27 Celebrating Friendship", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/f915dd75697c471b86c1dbed03ce60c7/"));
        list.add(new Cource("1300 Week 28 At the Doctor's Office", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/f610b99331a544c89289f82d26352436/"));
        list.add(new Cource("1300 Week 29 Healthy Body Healthy Me", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-01-01/d43e7ba8727b45bb96fceab8c09a795f/"));
        list.add(new Cource("1300 Week 8 Wheels and Wings", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-15/50a954d498bf45d9b6a3fcf551e4eeb5/"));
        list.add(new Cource("1300 Week 14 Feast for Ten", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/d7b08385d63c4d10b4bb937cac3e6544/"));
        list.add(new Cource("1300 Week 15 Bags and Buggies", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/cf625992496c420296026b0aad719661/"));
        list.add(new Cource("1300 Week 16 In the Kitchen", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/434ee5cced204cf7a80be9dfa3168ce7/"));
        list.add(new Cource("1300 Week 1 Welcome", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-12/d368babbea504f24bba4e388853979d2/"));
        list.add(new Cource("1300 Week 2 All About Me", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-12/e52d38bad07f414bbefd85cb4691cff6/"));
        list.add(new Cource("1300 Week 3 From My Head to My Toes", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-12/e249216d81224600b303db8ef8b96201/"));
        list.add(new Cource("1300 Week 4  My Senses", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-02-12/7e234d41d3c54070a3e7bd4d02242741/"));
        list.add(new Cource("1300 Week 43 We're on Our Way!", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-12/2019-05-12/5f3edc825a3f426db5d94062d909956f/"));
        list.add(new Cource("1400 Week 44 Setting Sail", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/bb6f4076a07f453ab6ae7ce27e5a6647/"));
        list.add(new Cource("1400 Week 45 A Day Beach", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/4f3b91f9eafe4cd78c86645f88cd7a3a/"));
        list.add(new Cource("1400 Week 46 Hiking Through the Hills", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/bb066f178716455884b2c2959b9f4c4d/"));
        list.add(new Cource("1400 Week 47 Summer Celebration", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/4a53a30c1e8949a994330681e826f2b3/"));
        list.add(new Cource("1400 Week 21 When Winter Comes", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/eb57688f48464ffcbd48ab8bae6e8968/"));
        list.add(new Cource("1400 Week 29 Weather Wiz Kids", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/1f4de959da244e209d653d6366dc3540/"));
        list.add(new Cource("1400 Week 30 As the Wind Blows", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/507bb30743754da184fe7cec51ccca7e/"));
        list.add(new Cource("1400 Week 31 Way Up in the Sky", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/4f8c6a8a790847e6846f4e40d793f8ab/"));
        list.add(new Cource("1400 Week 48 Summer Experiences", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/57b30847423c40339564e556d3647e8d/"));
        list.add(new Cource("1400 Week 49 Summer Sounds", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/d10d06305de34498ae836d224eca6fb7/"));
        list.add(new Cource("1400 Week 50 Summer Splash", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/243734b71b2d4933a3f60e176b1a6c65/"));
        list.add(new Cource("1400 Week 51 Oceans Alive", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/78ab93421bf440f083a544389a5a2f0b/"));
        list.add(new Cource("1400 Week 52 Celebrate Summer With Books", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/dbcc90f4756543cc9c6432cab242d869/"));
        list.add(new Cource("1400 Week 9  Awesome Autumn", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/8241c7120f06446c8ca2b6e6c7bac44d/"));
        list.add(new Cource("1400 Week 22 Snow Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/872fd50ddcdb4a468268631d3a2f851b/"));
        list.add(new Cource("1400 Week 23 Life in the Tundra", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/a1e61b127db04b36b7e1ce82aaaae2aa/"));
        list.add(new Cource("1400 Week 24 Over in the Arctic Where the Cold Winds Blow", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/4b90647ced714e6cb3da5db8d694704e/"));
        list.add(new Cource("1400 Week 25 Pet Adoption", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/9a46a95da6b74b16a829bdb1210801bf/"));
        list.add(new Cource("1400 Week 26 The Adventures of Taxi Dog", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/d4dc7057e3204b43be6eb21ca02b91d5/"));
        list.add(new Cource("1400 Week 32 Feathers for Lunch", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/b5d9bfc2f2fd460197748ab7ebeaabd9/"));
        list.add(new Cource("1400 Week 33 Springtime on the Farm", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/9e11fa0333e742dfb4fc015b0e4ddfe5/"));
        list.add(new Cource("1400 Week 34 Pond Changes", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/30669e65da954d2aaf620a9b5de43b20/"));
        list.add(new Cource("1400 Week 35 Oscar and the Frog", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/1458821ee1f947e0869c3029b11fc4b4/"));
        list.add(new Cource("1400 Week 36 Life in the Tropics", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/5fcc504cc4fa4dfa91709b884bfbdf10/"));
        list.add(new Cource("1400 Week 27 Taking Care of Animals", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/3e8043e091b34c4786ab3823542aa9fe/"));
        list.add(new Cource("1400 Week 28 Endangered Animals", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-01-01/8f0af01d13524eb9b3a749b29527d448/"));
        list.add(new Cource("1400 Week 37 Kids Can Garden", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/b340ee796b6d4600b7d221da95b66c6a/"));
        list.add(new Cource("1400 Week 38 Life in the Dirt", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/b71bf85ce3774f7aaca01c5aa856263a/"));
        list.add(new Cource("1400 Week 39 Charlie the Caterpillar", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/73f5c2611b244f29b89dc3ba5d717a63/"));
        list.add(new Cource("1400 Week 40 Rainbows", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/af0af85b7df34a589553dd07786946ba/"));
        list.add(new Cource("1400 Week 41 You're Invited", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/54c885774a4a4e28aa8f35d0d7ccf6c7/"));
        list.add(new Cource("1400 Week 42 Hooray for You!", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/b12fef1bda2947ddb58b88498a0e9574/"));
        list.add(new Cource("1400 Week 5  Salute the Flag", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/1c20bfd98ff540308969eb58571c1037/"));
        list.add(new Cource("1400 Week 6  My American Family", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/e2a667b875a04a96bd708ae4763224ef/"));
        list.add(new Cource("1400 Week 7  Cowboy Camp", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/b940dfe3913647ffb4ba2082c8c00fde/"));
        list.add(new Cource("1400 Week 8  Western Roundup", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-02-15/e913c5f26148406192fa3d1f73340c14/"));
        list.add(new Cource("1400 Week 1  Welcome", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/c343cb8325b64dffa84c57c5ed4b37be/"));
        list.add(new Cource("1400 Week 10 Forest Friends", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/c5961ffa716e4255bd4af38a1fa7b08e/"));
        list.add(new Cource("1400 Week 11 Apples and Pumpkins", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/f9d624bb7fde427a9aad79fc8ab5a271/"));
        list.add(new Cource("1400 Week 12 In the Pumpkin Patch", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/03902ca4a8654776978b8b75bffcf9a2/"));
        list.add(new Cource("1400 Week 17- Heartprints", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-06-12/6abd9a3f18494a8bbd74b154631706e3/"));
        list.add(new Cource("1400 Week 18- Giving and Sharing", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-06-12/17ff6ee0b58944b6934aeddda7e0d957/"));
        list.add(new Cource("1400 Week 19- Celebrate the Arts", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-06-12/0dd2b7f06e1148ac9e8818baa089d9ba/"));
        list.add(new Cource("1400 Week 20- Jazz Baby", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-06-12/8ba4a29a7f1f4508aa6709d42cc4cc58/"));
        list.add(new Cource("1400 Week 13- At the Food Court", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/8018180fdaab48a8b494fa53a48d9b6a/"));
        list.add(new Cource("1400 Week 14- Today is Monday", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/68df2ac2b83442eb99ed437d7a32cfec/"));
        list.add(new Cource("1400 Week 15- Family Fun", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/9844651a31fa4e99a2003bc3d819d7b0/"));
        list.add(new Cource("1400 Week 16- Louanne and the Perfect Family", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/59b4d1b41db245e99593911acc96766e/"));
        list.add(new Cource("1400 Week 2 I Like Me!", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/1d01e92fd98a481cae1aa89797c8f839/"));
        list.add(new Cource("1400 Week 3 Who Am I", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/9cef9b43bccd4d368389beb8909a1721/"));
        list.add(new Cource("1400 Week 4 Where I'm Going", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/4ce63fd2a5a7451ca735f472f3348768/"));
        list.add(new Cource("1400 Week 43 Let's Go", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-14/2019-05-12/28d20ea85e364c41848aead8c7fa00df/"));

        for (Cource cource : list) {
            String filename = "";
            String urlString = "";
            String temp = cource.getValue();
            int size = 60;
            String folder = cource.getId();


            try {
                for (int i = 1; i < size; i++) {
                    filename = i + ".jpg";
                    urlString = temp + filename;
                    saveUrl(folder, filename, urlString);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void saveUrl(String folder,final String filename, final String urlString)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            File directory = new File(String.valueOf(folder));
            if(!directory.exists()){
                directory.mkdir();
            }
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(folder+"/"+filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
}
