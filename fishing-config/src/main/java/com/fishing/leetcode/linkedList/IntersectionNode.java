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
        list.add(new Cource("Week 6 - L is for Liberty", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-02-15/b404f276eed84cf4aa082de9e56b3a08/"));
        list.add(new Cource("Week 7 - America is..", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-02-15/108c8637d68c4ce9982214b50593a2ed/"));
        list.add(new Cource("Week 8 - This Land is Your Land", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-02-15/22b718949ba2467b8ed72bb04a7a8925/"));
        list.add(new Cource("Week 44 - Sights and Signs", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/ddf28cfd573e4728b2ebf592b532d41b/"));
        list.add(new Cource("Week 45- Packing Our Bags", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/28177c7143d045379cb57f1f13d4dfb8/"));
        list.add(new Cource("Week 46 -By Land or by Sea", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/86bac95e1f334a03a804e52f78e42be0/"));
        list.add(new Cource("Week 47 -Hitting the Beach", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/ea6ceee6456d42d9b9e8535d5b1e43a9/"));
        list.add(new Cource("Week 30 - Famous Pilots", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/bb5ea1c0ca744ee69a5f82a00780aeff/"));
        list.add(new Cource("Week 31 - I Want to be an Astronaut", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/56a97d4ee23f48b8993bfa65f92277f8/"));
        list.add(new Cource("Week 32 - Fly Me to the Moon", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/28449ee475874b55ae0d4c859fa1f6aa/"));
        list.add(new Cource("Week 33 - The Rainforest Grew All Around", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/34dc493356c345c0ba469ae42dfc3065/"));
        list.add(new Cource("Week 34 - Reptiles of the Rainforest", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/4e0840e26a1944dfb9b5b8c306dfa17a/"));
        list.add(new Cource("Week 35 - Down by the Amazon River", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/c32221a2900e465e9a6711a89434599e/"));
        list.add(new Cource("Week 36 - Flying High in the Canopy", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/58a9d6fcdd3e4ae3a32656fa10d98c3c/"));
        list.add(new Cource("Week 37 - The Smallest Creatures of the Rainforest", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/7b511fb30db94584bbfcad88e76a3cb8/"));
        list.add(new Cource("Week 38 - Aloha!", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/805759d389834fa18ee1993201aa366f/"));
        list.add(new Cource("Week 39 - Life Under the Ocean", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/-15/2019-02-18/aa5b66ec7042415c9ba460438fa43a8c/"));
        list.add(new Cource("Week 9 - Barn Dance", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/58ddaf0d09834ce083ea0714846dc384/"));
        list.add(new Cource("Week 21 - The Three Snow Bears", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/2a294bdc40314eabb5cd9de78ef39352/"));
        list.add(new Cource("Week 22 - Adventures in Alaska", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/a48a3bc4a3c9433090f7566bd441888d/"));
        list.add(new Cource("Week 23 - The Penguin Who Wanted to Fly", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/4019ae4d49a24ae9b7b8f1e3627c7c20/"));
        list.add(new Cource("Week 24 - Penguins Penguins Everywhere", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/981c4a89bc6849bba62c526d8ffbcdc8/"));
        list.add(new Cource("Week 25 - I Can Save the Earth!", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/592017b5d1364045b08bcf1011b14b14/"));
        list.add(new Cource("Week 26 - The Three R's", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/0a7e938a7f9441e5805a9fe60ed071e1/"));
        list.add(new Cource("Week 27 - A Clean Community", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/dce34c55d6e340e3afdd09780263b43c/"));
        list.add(new Cource("Week 28 - Reduce Reuse Recyle Water", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-01-01/6a520dbcc21b4400bf5424ef1521541a/"));
        list.add(new Cource("Week 29 - Airport", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-02-18/c9c04e398a2847b8854fa637097a9bec/"));
        list.add(new Cource("Week 19 - Rabbit's Pajama Party", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/10c1b8784b764e248bda0c8aa79178ea/"));
        list.add(new Cource("Week 20 - It's a Celebration", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/a5162e6a1d174c35a9355470655d3d4e/"));
        list.add(new Cource("Week 48 - Exploring Parks", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/2988233e46ff42979fa180030314ccbf/"));
        list.add(new Cource("Week 49 - Celebrate Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/a900fa582e2f444ab1d56d548f0af387/"));
        list.add(new Cource("Week 50 - Experiences of Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/998b40d7a2634fe4b16f609d642bc807/"));
        list.add(new Cource("Week 51 - Sounds of Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/e4ba110d26d645f581e1aec209b8ea78/"));
        list.add(new Cource("Week 52v - Splashes of Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/455169110503426f94100a596bda10b1/"));
        list.add(new Cource("Week 10 - Get to Know a Scarecrow", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/7a7a7bd6fa134704b3c05e1777f9a13d/"));
        list.add(new Cource("Week 11 - Growing Veg", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/9901bc5501c94cb7a144931e38d35956/"));
        list.add(new Cource("Week 12 - Pumpkin Pumpkin", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/40e6d55ec37f4a39a35b352ae9cd2c83/"));
        list.add(new Cource("Week 13 - Manners at the Table-rev", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/93be2ad00ec74c4cb4d4e28562bf1929/"));
        list.add(new Cource("Week 14 - Measure Up in the Kitchen", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/de485f138aa2402b972340767a45984f/"));
        list.add(new Cource("Week 15 - One Little Two Little Three Little Pilgrims", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/e23e9e9126a14c74977f21803e935ef9/"));
        list.add(new Cource("Week 16 - Our Family Feast", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/683432b297dd4bd892048365993f56b2/"));
        list.add(new Cource("Week 17 - Tea with the Queen", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/5a1d67aa1a5d4cd98b917aa7f34ef950/"));
        list.add(new Cource("Week 18 - We're Having a Party", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-05-12/a3871880acc3483f999ee6022be0f86d/"));
        list.add(new Cource("Occipital Lobe Units (Brain Wave) - Infant", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-21/2019-01-01/28f05a2a680c48f797c649ef1d971851/"));
        list.add(new Cource("Temporal Lobe Units (Brain Wave) - Infant", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-21/2019-01-01/e9949e5533e544818985ce3bc7cdbeb4/"));
        list.add(new Cource("Frontal Lobe Units (Brain Wave) - Infant", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-21/2019-01-01/4267f46a94174983acd4121d00dd76ec/"));
        list.add(new Cource("Parietal Lobe Units (Brain Wave) - Infant", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-21/2019-01-01/5b2d81b680044d25893bbc41aef1b6b9/"));
        list.add(new Cource("Occipital Lobe Units (Brain Wave) - Toddler", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-23/2019-01-01/1b2ffd2e07b740268b212058b1a1379a/"));
        list.add(new Cource("Temporal Lobe Units (Brain Wave) - Toddler", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-23/2019-01-01/60afe5e234784571bc67d6512f30a3b2/"));
        list.add(new Cource("Frontal Lobe Units (Brain Wave) - Toddler", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-23/2019-01-01/ec3ec6a4be5e4fa7b5bd5e9c209316da/"));
        list.add(new Cource("Parietal Lobe Units (Brain Wave) - Toddler", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-23/2019-01-01/e91cb01f965a481c9978b776ebc8567a/"));
        list.add(new Cource("Occipital Lobe Units (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/484b87de77e74bcb93c74fefe77346f7/"));
        list.add(new Cource("Temporal Lobe Units-HALF PAGES (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/98d568186b30422f82b4d54770d2f4ca/"));
        list.add(new Cource("Frontal Lobe Units-HALF PAGES (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/256a1aa5a68e4321912bd3b737b2b99f/"));
        list.add(new Cource("Frontal Lobe Units-FULL PAGES (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/bf92613ccaa74f93a4092e97a71bf6d2/"));
        list.add(new Cource("Parietal Lobe Units-FULL PAGES (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/a42ddb5339344f93b8d8d2fd1d2f46c5/"));
        list.add(new Cource("Parietal Lobe Units-HALF PAGES (Brain Wave) - Preschool", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/3-24/2019-01-01/2a72e6738ba54ddca6e03c07410e46fd/"));
        list.add(new Cource("1-STEAM AHEAD - Getting to Know You", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-25/2019-01-01/dfe0c63fb23a4727b8e3391c8bd409f0/"));
        list.add(new Cource("2-STEAM AHEAD - My Wonderful World", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-26/2019-01-01/640acf381d494375b39652dca65aa3cb/"));
        list.add(new Cource("3-STEAM AHEAD - Autumn Highlights", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-27/2019-01-01/630fa25adcee47ce9da1b4c412a31ac3/"));
        list.add(new Cource("4-STEAM AHEAD - Family and Food", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-28/2019-01-01/e4e869a0c56e43c1ae4d2e1aac0a65a8/"));
        list.add(new Cource("5-STEAM AHEAD - Celebrate Good Times", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-29/2019-01-01/1992bba484164c49948c7a806782d0ae/"));
        list.add(new Cource("6-STEAM AHEAD - Winter Happenings", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-30/2019-01-01/1cc6ccb700894dc6a4d79d0a5c90d38d/"));
        list.add(new Cource("7-STEAM AHEAD - Kids Care", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-31/2019-01-01/c2e99623d691472e80af6481bfdd3606/"));
        list.add(new Cource("9-STEAM AHEAD - Animal Kingdom", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-32/2019-01-01/f94c10bf243947f381958cf6c1e0f17d/"));
        list.add(new Cource("8-STEAM AHEAD - Up Up and Away", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-33/2019-01-01/f22e4fd478a241fcaf196fc52467debd/"));
        list.add(new Cource("10-STEAM AHEAD - The Great Outdoors", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-34/2019-01-01/15bfd29274db42859c762b5c2af6ce8c/"));
        list.add(new Cource("11-STEAM AHEAD - Destination Summer", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-35/2019-01-01/1811dd234249430ea17d5bc0ebd8863c/"));
        list.add(new Cource("12-STEAM AHEAD - Shades of Summer", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/4-36/2019-01-01/177ad965600748e281bb4063f6029d7f/"));
        list.add(new Cource("1200 Week 4 - Jack and Jill", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-23/6e4ef41881a1434f8558bd1fdb8ca5b9/"));
        list.add(new Cource("1200 Week 43- Say Hello to Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/de358ca8004d4620bd12684be03c0d51/"));
        list.add(new Cource("1200 Week 44- Traveling Tales", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/826ef612582f4256a9fe036492c3b77f/"));
        list.add(new Cource("1200 Week 45- Beach Balls and Sand Castles", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/aa8fa64306a84d6cae8c9e12f41e6b26/"));
        list.add(new Cource("1200 Week 46- Warm Winds", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/bd61ada86cbe4c949db546cce44516b7/"));
        list.add(new Cource("1200 Week 47- Summer Games", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/e5b444bfc5ce46bd8b4d0cba4a521202/"));
        list.add(new Cource("1200 Week 48- Colors of the Rainbow", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/e2a8dff1e21d44eea2239c2844caf8c9/"));
        list.add(new Cource("1200 Week 49- Going On a Picnic", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/480b1755ed504212b3f583b18e750164/"));
        list.add(new Cource("1200 Week 50- Dressed for Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/898e9178ab8f41968946219db7346a0d/"));
        list.add(new Cource("1200 Week 51- Beautiful Flowers", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/80565721ef3f4e4bae5d831a094d6754/"));
        list.add(new Cource("1200-Week 9 -Autumn Trees", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/8abbd8ebdfda42d6a75c9e260e87d3f5/"));
        list.add(new Cource("1200-Week 52-Bye-Bye Summer", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/2b8384aea901462b8a0bf47023ed2790/"));
        list.add(new Cource("1200-Week 10- Red Apples", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/dc92274f109f4d1fbb8dc8ceb6f4a159/"));
        list.add(new Cource("1200-Week 11- Orange Pumpkins", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/e826c4af5bf14e2db24da864be8393af/"));
        list.add(new Cource("1200-Week 12- Black Spiders", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/317b94f2c5dd4e2da5f77e529b6c4a00/"));
        list.add(new Cource("1200-Week 13- Cookbook", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/9d62f2f506e841838a6f0d589db06354/"));
        list.add(new Cource("1200-Week 17- Bright Lights", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/1e3ca2097e0347b6966c4e3a044442da/"));
        list.add(new Cource("1200-Week 14- Cooking in the Kitchen", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/89f2b2489bd94aa9880df9fa665dd7ba/"));
        list.add(new Cource("1200-Week 18- Let's Decorate", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/70d5fd6e71d34a7aa66dbdb365bd1765/"));
        list.add(new Cource("1200-Week 15- Home and Family", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/9e88ac33c5a34b888be4c5631fa0fbeb"));
        list.add(new Cource("1200-Week 19-Giving Gifts", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/e0ad681bd8394c9fa3298e6bdd880a85/"));
        list.add(new Cource("1200-Week 16-Traveling Together", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/540c62e769fa4fa592b9880f4962a3b5/"));
        list.add(new Cource("1200-Week 20-Sweet Treats", "https://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-05-12/382323896abb4744b381c8013ff2c712/"));
        list.add(new Cource("1200-Week 30-Goodnight Moon", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/de9e4fc4bf414b459ecf76144eaa061e/"));
        list.add(new Cource("1200-Week 31-Good Morning Sun", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/a40eef5ef6074fedac422c1d8cdde78c/"));
        list.add(new Cource("1200-Week 32-Airplanes in the Sky", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/92b9666161ce4a8983463a2ef8c93196/"));
        list.add(new Cource("1200-Week 33-Kites Up High", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/f939d4602fbb41e6a81ba3dc9e4c8d2d/"));
        list.add(new Cource("1200-Week 34-Family Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/204673c24728486cbc6a239510662943/"));
        list.add(new Cource("1200-Week 35-Farmyard Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/993818cdf8d94b8b90985ecbe6481096/"));
        list.add(new Cource("1200-Week 36-Field Trip Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/4b014af8a5584ed4af145992c94ac2b7/"));
        list.add(new Cource("1200-Week 37 - Swimming Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/af3da142204545f4a443e2986dc2b883/"));
        list.add(new Cource("1200-Week 38 - Butterfly Dance", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/842c19b1510d4baeae1fd54ca98c8d0e/"));
        list.add(new Cource("1200-Week 21 - Snowflakes Falling", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/9b4235f189684c57b961dae002681935/"));
        list.add(new Cource("1200-Week 22 - Keeping Warm in Winter", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/ab5d6dd8835e45ef9d13baf9b2fa72dc/"));
        list.add(new Cource("1200-Week 39 - Baby Birds", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/4e6b35a0f76a48019f7fff7f4134f63d/"));
        list.add(new Cource("1200-Week 40 - Growing Flowers", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/64a5b3357dcc4f4e9fa55617deef8f56/"));
        list.add(new Cource("1200-Week 41 - Hands in the Garden", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/f3437e40b79a40f59d38f3d2e95e3429/"));
        list.add(new Cource("1200-Week 42 - Five Little Ducks", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/23854b17dace4f9f851771a480a11770/"));
        list.add(new Cource("1200-Week 5 - At the Fire Station", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/0b757ca7446b44648d86faa99630d1c4/"));
        list.add(new Cource("1200-Week 6 - At the Post Office", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/8621e869e5a94743b8948e6058a33f3d/"));
        list.add(new Cource("1200-Week 7 - At the Police Station", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/9c383c8f46294ae2ad51548cd39005af/"));
        list.add(new Cource("1200-Week 8 - At the Doctor's Office", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-02-15/a953b8dd7af74c84a2f0350d44988ef4/"));
        list.add(new Cource("1200-Week 23 - The Mitten", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/c1a280cabd9149f283b0b87ca29a51f2/"));
        list.add(new Cource("1200-Week 24 - At the Circus", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/6c8e26c882dc468fbcee536f38a730b4/"));
        list.add(new Cource("1200-Week 25 - Circus Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/42d3d3aae54944ad96fe7386dde64b22/"));
        list.add(new Cource("1200-Week 26 - Yummy Tummy", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/aaf41362610c46928f73e9f0b646af46/"));
        list.add(new Cource("1200-Week 27 - Making Friends", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/e9669db38bca48409ee98bddb506b82b/"));
        list.add(new Cource("1200-Week 28 - Healthy Hearts", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/b20b26a592d14f6d91b86e1e3629e357/"));
        list.add(new Cource("1200-Week 29 - Happy Teeth", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-01/b8d3066127514f188a8cd879dab476df/"));
        list.add(new Cource("1200-Week 1 - Welcome", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-23/af47558720664eb6a405da4a54a7f26d/"));
        list.add(new Cource("1200-Week 2 - Helping Hands", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-23/20df99cd5ad544acb933e82b0ff67ac5/"));
        list.add(new Cource("1200-Week 3 - Head to Toe", "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-10/2019-01-23/493c3f2b572540fdb8642dcc146cb57a/"));
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
            Thread.sleep(10000);
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
