// Andy's Workshop Open Source Reflow Controller
// Copyright (c) 2015 Andy Brown. All rights Reserved.
// Please see website (http://www.andybrown.me.uk) for full license details.

package uk.me.andybrown.awreflow2;


/**
 * Default profile for leaded
 */

public class LeadReflowProfile extends ReflowProfile {

  /**
   * Constructor
   */

  public LeadReflowProfile() {
    super(
      "JEDEC J-STD-020D.1 Leaded",
        new ReflowRegion[]{
                new ReflowRegion("Preheat",90,150),
                new ReflowRegion("Soak",180,180),
                new ReflowRegion("Ramp up",200,210),
                new ReflowRegion("Reflow",220,210),
                new ReflowRegion("Ramp down",240,180),
                new ReflowRegion("Cool down",270,25)
        },
        new double[] {
          25,
          26.39,
          27.80,
          29.22,
          30.65,
          32.08,
          33.53,
          34.99,
          36.45,
          37.93,
          39.41,
          40.90,
          42.40,
          43.90,
          45.42,
          46.93,
          48.46,
          49.99,
          51.52,
          53.06,
          54.60,
          56.15,
          57.70,
          59.25,
          60.81,
          62.37,
          63.93,
          65.49,
          67.06,
          68.62,
          70.19,
          71.75,
          73.31,
          74.88,
          76.44,
          78.00,
          79.56,
          81.12,
          82.67,
          84.22,
          85.77,
          87.31,
          88.85,
          90.38,
          91.91,
          93.44,
          94.96,
          96.47,
          97.97,
          99.47,
          100.96,
          102.44,
          103.92,
          105.38,
          106.84,
          108.29,
          109.73,
          111.15,
          112.57,
          113.98,
          115.37,
          116.75,
          118.12,
          119.48,
          120.83,
          122.16,
          123.48,
          124.78,
          126.07,
          127.35,
          128.61,
          129.85,
          131.08,
          132.29,
          133.49,
          134.66,
          135.82,
          136.97,
          138.09,
          139.20,
          140.28,
          141.35,
          142.39,
          143.42,
          144.43,
          145.41,
          146.37,
          147.31,
          148.23,
          149.13,
          150,
          150.8494479,
          151.6758299,
          152.479537,
          153.2609602,
          154.0204904,
          154.7585185,
          155.4754355,
          156.1716324,
          156.8475,
          157.5034294,
          158.1398114,
          158.757037,
          159.3554973,
          159.935583,
          160.4976852,
          161.0421948,
          161.5695027,
          162.08,
          162.5740775,
          163.0521262,
          163.514537,
          163.961701,
          164.3940089,
          164.8118519,
          165.2156207,
          165.6057064,
          165.9825,
          166.3463923,
          166.6977743,
          167.037037,
          167.3645713,
          167.6807682,
          167.9860185,
          168.2807133,
          168.5652435,
          168.84,
          169.1053738,
          169.3617558,
          169.609537,
          169.8491084,
          170.0808608,
          170.3051852,
          170.5224726,
          170.7331139,
          170.9375,
          171.1360219,
          171.3290706,
          171.517037,
          171.7003121,
          171.8792867,
          172.0543519,
          172.2258985,
          172.3943176,
          172.56,
          172.7233368,
          172.8847188,
          173.044537,
          173.2031824,
          173.361046,
          173.5185185,
          173.6759911,
          173.8338546,
          173.9925,
          174.1523182,
          174.3137003,
          174.477037,
          174.6427195,
          174.8111385,
          174.9826852,
          175.1577503,
          175.336725,
          175.52,
          175.7079664,
          175.9010151,
          176.099537,
          176.3039232,
          176.5145645,
          176.7318519,
          176.9561763,
          177.1879287,
          177.4275,
          177.6752812,
          177.9316632,
          178.197037,
          178.4717936,
          178.7563237,
          179.0510185,
          179.3562689,
          179.6724657,
          180,
          181.1162543,
          182.4048297,
          183.8437384,
          185.4109925,
          187.0846043,
          188.842586,
          190.6629498,
          192.5237079,
          194.4028724,
          196.2784556,
          198.1284698,
          199.930927,
          201.6638395,
          203.3052195,
          204.8330791,
          206.2254307,
          207.4602864,
          208.5156584,
          209.3695588,
          210,
          210.7125,
          211.35,
          211.9125,
          212.4,
          212.8125,
          213.15,
          213.4125,
          213.6,
          213.7125,
          213.75,
          213.7125,
          213.6,
          213.4125,
          213.15,
          212.8125,
          212.4,
          211.9125,
          211.35,
          210.7125,
          210,
          209.4713829,
          208.8997079,
          208.2751095,
          207.5877224,
          206.8276809,
          205.9851196,
          205.0501729,
          204.0129754,
          202.8636616,
          201.592366,
          200.1892231,
          198.6443673,
          196.9479332,
          195.0900553,
          193.0608681,
          190.8505061,
          188.4491038,
          185.8467957,
          183.0337162,
          180,
          176.7800926,
          173.2962963,
          169.5625,
          165.5925926,
          161.400463,
          157,
          152.4050926,
          147.6296296,
          142.6875,
          137.5925926,
          132.3587963,
          127,
          121.5300926,
          115.962963,
          110.3125,
          104.5925926,
          98.81712963,
          93,
          87.15509259,
          81.2962963,
          75.4375,
          69.59259259,
          63.77546296,
          58,
          52.28009259,
          46.62962963,
          41.0625,
          35.59259259,
          30.2337963,
          25
    });
  }
}
