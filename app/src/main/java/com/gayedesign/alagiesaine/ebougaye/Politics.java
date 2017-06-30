package com.gayedesign.alagiesaine.ebougaye;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class Politics extends ListFragment {


    public Politics() {
        // Required empty public constructor
    }

    ListView listView;
    int curPosition = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_article,container,false);

        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,POLITICS);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        showDetails(position);
        //super.onListItemClick(l, v, position, id);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            curPosition = savedInstanceState.getInt("savedCurPosition");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("savedCurPosition",0);
    }

    private void showDetails(int position) {
        curPosition = position;
        Intent intent = new Intent(getActivity(),PoliticsActivity.class);
        intent.putExtra("position",position);
        startActivity(intent);
    }
    static String[] POLITICS = {"Are we better than him?","Are you really brave and patriotic?","Arson attack on The Independent","Hi Jammeh!",
            "Conflicting Remarks From Yahya And Susan","Debunking Sarr and Jammeh","Dialogue-With-The-People Tour",
            "Perpetuation of Dictators","The Downfall Of Jammeh","Good and bad omens","Have You Forgotten?","Too Many Unfulfilled Promises",
            "Human being or Monster?","The Ivorian crisis",
            "Lessons from the Kenyan Elections","Operation Bulldozer on the Balance",
            "Pardoning Prisoners and Gambians in the Diaspora","Rejoinder to Samsudeen Sarr’s Rebuttal",
            "Refuting The Satanic Views Of Samsudeen Sarr","You are a spin doctor! ",
            "Gaye’s Theory Of Unravelling Jammeh","Welcome Sall, Goodbye Wade!","What a damnable Act!"
            };


    static final String[] POLITICS_DETAILS = {

            "<font color=\"black\"><b>Are we better than him?</b><br><br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "We agree that he is a bad leader and thus should be removed from power as a matter of urgency <br>" +
                    "Yet, we seemingly have agreed to disagree in our efforts to dislodge him, <br>" +
                    "Behaving as competitors, rivals and enemies who cannot see eye to eye, <br>" +
                    "Giving him the chance to entrench himself and prolong his stay in power," +
                    "Allowing him to continue riding on our backs <br> <br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "We brand him as a cruel, merciless person, <br>" +
                    "Saying that he is ready to do any nasty thing he thinks can facilitate his perpetuation in power <br>" +
                    "Yet, we willingly serve as his informants, torturers and killers, <br>" +
                    "Unmindful of the fact that he habitually eliminates those who do the dirty job for him as a way of destroying evidence, <br>" +
                    "And that our wicked acts always haunt us  <br> <br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "We continue to doubt and dispute his intelligence and cleverness, <br>" +
                    "Calling him a daft and a fool <br>" +
                    "Yet, he is able to manipulate us anyhow, <br>" +
                    "And use his divide-and-rule tactics to create mistrust, hatred, enmity and disunity among us, <br>" +
                    "Making us fight each other fiercely, <br>" +
                    "Thereby consolidating his power continuously <br><br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "We say he lacks the required education, knowledge, intellect and wisdom to lead us, <br>" +
                    "Describing him as half-baked and unlettered <br>" +
                    "Yet, we the highly educated “knowledgeable, intellectuals and sages” are always eager to mortgage our dignity and work as his close allies, <br>" +
                    "Serving his personal interest at the expense of national interest, <br>" +
                    "In order to impress him and gain his favour, <br>" +
                    "Allowing him to harass and humiliate us as he wishes, <br>" +
                    "Because of our love for status, titles and riches, <br>" +
                    "And our desire to “enrich” our CVs or résumés <br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "We claim that we knew him as a very bad person before he came to power <br>" +
                    "Yet, we hurriedly and happily climbed aboard his bandwagon and served as his errand boys, propagandists, image-makers and ardent defenders when he seized power, <br>" +
                    "Treating him as a demigod, <br>" +
                    "Heaping praises on him, <br>" +
                    "Projecting him as a national hero and a saviour, <br>" +
                    "Quarrelling with his critics whom we labelled as detractors, traitors and unpatriotic citizens, <br>" +
                    "In our attempts to help him cling onto power, <br>" +
                    "Turning blind eyes to the atrocities he was committing, <br>" +
                    "And the sufferings he was inflicting on his compatriots <br>" +
                    "Only to turn around and start castigating and insulting him out of disgruntlement when he dumped us, <br>" +
                    "Portraying ourselves as patriots and saints, <br>" +
                    "Calling for his immediate resignation or removal by any means, <br>" +
                    "Talking as if we have total control and authority over others, <br>" +
                    "Blaming his newly-hired enablers for doing what we used to do to help him tighten his grip on power and for failing to do what we failed to do to bring him down, <br> <br>" +
                    "" +
                    "Are we better than him? <br>" +
                    "Maybe we are better than him," +
                    "But we are yet to prove that beyond reasonable doubt <br>" +
                    "We can only prove ourselves as better citizens than him by changing our attitude for the better, <br>" +
                    "Ironing out our differences, <br>" +
                    "And working hand in hand to uproot him and bring sanity for the benefit of all <br>" +
                    "The earlier the better! <br>" +
                    "We are tired and fagged out! <br>" +
                    "Enough is enough! </font> <br>" +
                    ""

            ,"<font color=\"black\"><b>Are you really brave and patriotic, Yahya? </b><br><br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "You always project yourself as the bravest and most patriotic man, <br>" +
            "Labelling your opponents and perceived enemies as cowards and unpatriotic citizens <br>" +
            "But your acts prove the contrary, <br>" +
            "Making us believe that you are a virtual hypocrite and a pretender, <br>" +
            "And that you merely try to camouflage the situation and divert attention <br> <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "Demonstrators from your country held you hostage at a hotel during your recent visit to the US, <br>" +
            "Preventing you from leaving the premises the whole day, <br>" +
            "Despite your prior threats to teach your Diaspora compatriots a bitter lesson if you lay hands on them <br>" +
            "Amazing! <br>" +
            "If you are really brave as you want to fool us into believing, why didn’t you confront the protestors? <br>" +
            "Why didn’t you walk out of your hotel room and crush them with a single blow? <br> <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "Reports have it that you were dispossessed of your strange objects at the entrance of the UN headquarters, <br>" +
            "And that you complied without complaint like a small kid, <br>" +
            "And timidly walked in barehanded  <br>" +
            "Incredible! <br>" +
            "Why didn’t you insist on carrying your stick and beads as a “brave” man? <br>" +
            "Why did you bow down so easily? <br>" +
            "" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "Homosexuality, greed and obsession with domination featured prominently in your UN speech, <br>" +
            "As though they are the most serious threats to humanity <br>" +
            "These are not worse than dictatorship, <br>" +
            "And you have confessed to being a dictator <br>" +
            "We understand that you discuss the issue of homosexuality ad nauseam as a way of diverting attention from more pressing issues affecting your country and people <br> <br>" +
            "You are indisputably greedy and obsessed with domination <br> <br>" +
            "This prompts you to treat your country as your personal property, <br>" +
            "And regard your compatriots as your subjects <br>" +
            "You are engaged in business in spite of the fact that your business activities conflict with your role as a head of state <br>" +
            "You have personalized and monopolized state institutions <br>" +
            "You blatantly grab land and confiscate people’s properties <br>" +
            "You try to stifle dissent and force your rivals and opponents to submit to your whims and caprices, <br>" +
            "By seizing their inalienable rights <br>" +
            "Do you think you are morally justified in preaching against homosexuality, greed and obsession with domination? <br>" +
            "If you are really patriotic, why dwell on homosexuality and ignore other issues of greater concern affecting your compatriots? <br> <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "You have announced your decision to withdraw our country from the Commonwealth, <br>" +
            "Branding it a neo-colonialist institution <br>" +
            "It is common knowledge that you felt very bad and complained bitterly when our country was suspended by the Commonwealth following your coup <br>" +
            "Didn’t you know that the Commonwealth is a “neo-colonialist” institution when you were grumbling about the suspension? <br>" +
            "What has changed over the years to warrant the sudden withdrawal? <br>" +
            "Are you sure your decision will do our country more good than harm? <br>" +
            "If you are really patriotic, why make such a rash, unilateral decision? <br> <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "You have just presided over a trial by media in an alleged asylum scam involving a prominent member of the UDP (United Democratic Party) of our country <br>" +
            "The case is handled in such a way that the alleged crime has the potential to make the sky fall on us, <br>" +
            "With the alleged culprits portrayed as unpatriotic citizens and undesirable elements of Gambian society, <br>" +
            "Leading many to believe that it has been politicized and blown out of proportion <br>" +
            "It is reported in the international media that your government has sold Residence Permits at $10,000 each to Chinese who have never set their feet on Gambian soil <br>" +
            "Additionally, there are reports of Tunisians having been intercepted with Saudi visas on Gambian passports sold to them at €4,000 each, <br> <br>" +
            "To facilitate their journey to Saudi Arabia for pilgrimage <br>" +
            "Besides, it is alleged that your Moroccan and Guinean in-laws have been issued with Gambian diplomatic passports <br>" +
            "Have you ever bothered to investigate such disturbing reports and allegations as you have done with the alleged asylum scam?" +
            "If so, why not make the results public? <br>" +
            "If not, are you brave and patriotic enough to order investigation now and share the results with us? <br> <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "Your blabbermouth has recently read a loaded statement on your behalf, <br>" +
            "Castigating the US, UK, UDP and the media, <br>" +
            "Claiming that they bear malice against our country and your government, <br>" +
            "And work hand in glove to tarnish the image of our country and people <br>" +
            "Accusing these Western countries and the UDP of racism and tribalism," +
            "<br> " +
            "Vowing that the UDP will never rule our country <br>" +
            "Your allegations are unsubstantiated and your remarks unwarranted <br>" +
            "What does our country have that can made the US and UK envious and behave begrudgingly towards it as implied in your statement? <br>" +
            "Now that you have realized how “bad” the Americans are, will you sell the multi-million dollar mansion you bought in the US and send your family back home? <br>" +
            "Do you know what God has in stock for the UDP? <br>" +
            "Do you have the authority to decide who or which group of people will rule our country after your departure? <br>" +
            "Do you consider it convincing to deny media reports without proving them wrong? <br>" +
            "Do you see your acts as bravery and patriotism? <br>" +
            "What do you expect to gain from your statement other than alienating our development partners and antagonizing your compatriots? <br>" +
            "Would a patriotic, peace-loving leader sow the seeds of discord and disharmony for political gains in a small country like ours by portraying a particular ethnic group negatively as you have done? <br>" +
            "Given the manner in which you comported yourself when faced with the protestors and the security officers at the UN headquarters in the US, do you think you can make people believe that you are a brave man? <br>" +
            "" +
            "Are you really brave and patriotic, Yahya? <br>" +
            "Certainly not! <br>" +
            "It is evident that you are a coward and an unpatriotic citizen <br>" +
            "You are in power solely for self-enrichment and self-aggrandizement <br>" +
            "Pure and simple! <\font> <br>"
            ,

            "<font color=\"black\"><b>Arson attack on The Independent: What a deplorable act!</b> <br> <br>" +
                    "" +
                    "Disgusted and saddened by the recent arson attack on The Independent newspaper paper, I join concerned individuals, institutions and organizations in condemning it and calling on the police to try by all means to track down the culprits. This abhorrent act is not an offence to The Independent alone but also to readers in general, The Gambia, Africa and humanity at large. <br> <br>" +
                    "" +
                    "The arsonists have oppressed The Independent greatly by destroying their newly acquired printing machine and other valuables, thereby inflicting a heavy loss on the company and interrupting their work. Needless to say, this is a criminal act against the company. <br> <br>" +
                    "" +
                    "By interrupting the work of this popular, widely read newspaper, the perpetrators of this heinous, monstrous act have done a very great disservice to the readers, for The Independent is a “must read” to many, Gambians and non-Gambians alike. Therefore, the rogues have placed their lives in jeopardy by oppressing the public, which is very unwise of them. <br> <br>" +
                    "" +
                    "The reprobates have offended The Gambia as a nation, for their reprehensible act has nullifying effects on our economy in that it can repel or scare away investors and tourists who are always looking for a peaceful atmosphere, and whose presence in The Gambia is needed to give a much-needed boost to our economy. As reported, a Chinese businessman has suffered great losses in the incident as a result of the gutting of his store like the building that housed the printing press of The Independent, which is very disheartening. Can we expect that businessman to have the courage to make heavy investments in The Gambia after such a bitter experience? Certainly not! He may, and genuinely for that matter, feel dejected and discouraged by this heartbreaking, nonsensical act. Likewise, would-be or potential investors and tourists may be discouraged. Additionally, the incident has the danger of smearing the reputation of The Gambia which used to be renowned for peace. <br> <br>" +
                    "" +
                    "This incident will worsen the already-soiled image of Africa which is notorious for intolerance and barbaric acts. It lends credence to the widely harboured stereotype that Africans are uncivilized, which many Africans find contemptuous and try to dispel. <br> <br>" +
                    "" +
                    "Taking a global view of the matter, one can say that this abominable act is demeaning to humanity as a whole. It demonstrates how human beings can reduce themselves to beasts by oppressing their fellow men despite the fact that they are equipped with the faculty to reason besides having in place laws and rules laid down with the aim of guiding their actions. This act is not expected in a generation considered to be modern and civilized. <br> <br>" +
                    "" +
                    "Evidently, the act is immeasurably outrageous and deplorable. Therefore, it is the duty of every peace-loving and sensible person to reprehend or denounce it outright. In this respect, I commend Honourable Halifa Sallah, The point newspaper, the Daily Observer, the Gambia Press Union and its able president and secretary general, DA Jawo and Pa Nderry Mbai respectively, the police and others who have voiced their aversion to this nauseating, vexatious act and expressed their sympathy with The Independent. <br> <br>" +
                    "" +
                    "By condemning the dastardly act unreservedly and urging the public to refuse intimidation, express solidarity with the media and expose the perpetrators as a way of safeguarding freedom of expression- as reported in The Point newspaper- Honourable Sallah has, once again, manifested his compassion, kindness, mercy, tolerance, intellect, respect for democracy and human rights, peace-loving nature and high sense of maturity and responsibility. His reaction is exactly what is expected of a leader and a representative of the people. Viva, Honourable Sallah! <br> <br>" +
                    "" +
                    "The aforementioned newspapers and the Gambia Press Union have done a wonderful job by deploring the act in the strongest possible terms and sympathizing with The Independent as a way of expressing their solidarity. This, I believe, will go quite a long way in uniting them and cementing their relationship, thereby making it easy for them to defend and protect themselves and thus facilitate their work. <br> <br>" +
                    "" +
                    "As reported, the police have visited the scene where they collected a pistol dropped by one of the pesky arsonists and issued a press release thereafter, in which they have condemned the act and promised to try to apprehend the miscreants and bring them to book. This is a very encouraging and laudable move. However, the police have a very big challenge, as many people have the deep conviction that they can easily track down the scoundrels, given the clues they already have. People are waiting eagerly and impatiently for the results of their investigations. <br> <br>" +
                    "" +
                    "I hope the police will live up to expectations and hence help deter villainous people like these clods and restore the good image of The Gambia. <br> <br>" +
                    "" +
                    "At this juncture, I deem it fitting to hail the staff members of The Independent who were present at time of the attack, particularly Namorri Trawally and the Nigerian Chickwas who sustained injuries, and wish them speedy recovery. They acted sensibly and courageously. It is Namorri who hid the pistol, which can serve as a good clue. I also extol the bravery of the editors of The Independent who have promised to continue to work pertinaciously in the service of the public rather than bowing to the villains. Like Honourable Sallah perspicaciously and felicitously said, people should resist intimidation and defend freedom. Therefore, I add my voice to his and that of DA Jawo and Pa Nderry Mbai who have taken a similar stance. I call on all journalists to remain undaunted and imperturbable. <br> <br>" +
                    "" +
                    "It is gratifying to note that one of the arsonists was burnt- maybe seriously- during their operation and dropped his pistol shouting, “I’m burn! I’m burnt!” That serves him right. As a colleague of mine aptly and rightly commented on reading this in the Daily Observer, the man behaved shamefully by crying like a small child, for it is normal to be burnt in an attempt to burn a person or a property. The burns of the man are a bad omen for him. He may be burnt in hellfire along with his accomplices as they have burnt down the properties of The Independent and the Chinese businessman. While I profoundly sympathize with The Independent and the Chinese businessman, I do not pity the burnt arsonist the least. It is part of wickedness to pity wicked people. That can be interpreted as a way of encouraging the vice and lack of compassion for their victims. Therefore, the burnt arsonist merits curses and a ferocious, agonizing punishment, not sympathy.  <br> <br>" +
                    "" +
                    "If the motive behind this arson attack is to cripple and gag or silence The Independent, I put it to these knaves that the act will deceive its purpose. It will earn the paper public sympathy and make it more popular, thereby rendering their efforts futile. Instead of yielding the desired results, the act will provoke the public into heaping opprobrium on the arsonists, as evidenced by the condemnations they have received thus far. If they felt offended by the paper, the option was open for them to seek redress at the courts rather than resorting to this criminal act, which can easily backfire. If they were angered by the paper for exposing them, I put it to them that it is easier for them to change their behaviour for the better than to misbehave and expect journalists to be silent about their misdeeds. I exhort the authors of this malevolent act to put on their thinking caps or mull over the matter, as such a behaviour is not in the interest of anybody. It does more harm than good to them, if at all it can benefit them in any way. If they cannot behave like good citizens and work for the betterment of their people, which seems to be the case, they should leave productive, serviceable and patriotic citizens alone rather than hindering them and jeopardizing their own lives in the process. By engaging in such uncivilized acts, they portray themselves as people who have no common sense. These blackguards and their ilk are the riffraff of our society. They value much less than dolls and toys in general. Therefore, we should endeavour to rehabilitate them or filter them out, as one rotten potato in a sack can spoil all the potatoes in the sack.     <br> <br>" +
                    "" +
                    "Finally, I urge all those concerned to assist The Independent in whatever way possible and make it a point of duty to volunteer any information that can lead to the captivity of the rascals. Assisting The Independent means helping oneself or helping the public, for the paper plays a very vital role in educating, informing, enlightening and entertaining the public, thereby contributing immensely to our socio-economic and intellectual growth and development. Given the fact that one of the arsonists was burnt and may thus visit health facilities for treatment or stay at home to nurse his wounds as a way of avoiding apprehension by the police, health workers and his neighbours may be in a position to help the police in their hunt for the culprits. People should bear in mind that it does not pay to harbour criminals and that helping the police to capture the perpetrators is both a national and a humanitarian obligation.  <br> <br>" +
                    "" +
                    "Long live The Independent! Amen! <\font>  <br> <br>"

            ,
            "<font color=\"black\"><b>Hi Jammeh! </b> <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "As you commemorate your coup d’état of 22nd July 1994, I judge it apropos and timely to remind you of some of your innumerable promises, <br>" +
                    "In case you have forgotten, <br>" +
                    "Due to your tight schedule, laborious tasks and burdensome preoccupations, <br>" +
                    "In spite of the notion harboured by those you have hypnotized and brainwashed,  <br>" +
                    "That you are infallible, impeccable and all-knowing, equipped with a capacious memory <br>" +
                    "You have said so much and a lot of water has passed under the bridge since you mounted power through that putsch, <br>" +
                    "For which reasons observers describe you as haughty, insolent, irritable, cantankerous, querulous, devious, treacherous, eccentric,  pitiless, negligent, <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You complained upon assuming office that your predecessor overstayed in power, <br>" +
                    "Contending that even 10 years in power is too long a time, <br>" +
                    "Vowing that no-one would be allowed to stay in power in your country for more than 10 years from then <br>" +
                    "But you blatantly and doggedly refuse to have presidential term-limit enshrined in the constitution of your country as recommended by the Consultative Committee you set up to look into matters pertaining to the transition from military to civilian rule, <br>" +
                    "Saying repeatedly, plainly and publicly that neither election nor coup d’état will remove you from power, <br>" +
                    "And that those vying to succeed you should wait patiently like a vulture for 400 years, <br>" +
                    "Giving the impression of invulnerability and invincibility  <br>" +
                    "You however lack the courage to organize free and fair elections and flatly reject the idea of providing a level playing field for elections as demanded by the opposition and recommended by the international community, <br>" +
                    "And keep tightening your security by accumulating heavy, dangerous weapons," +
                    "Buying the loyalty of gullible members of the armed and security forces by granting them short-term privileges, <br>" +
                    "Eliminating those among them you perceive to be a threat to your security and existence as a leader by executing them or sentencing them to life imprisonment, <br>" +
                    "And pitting them against each other by ordering them to arrest, detain, torture or butcher each other, <br>" +
                    "With the aim of avoiding coup d’état<br>" +
                    "You have baptized yourself Dictator for Development in your attempt to hoodwink your compatriots, <br>" +
                    "Claiming that democracy is an illusion, <br>" +
                    "Accusing Western democratic countries of extreme racism and xenophobia <br>" +
                    "But you have ironically bought a mansion at an exorbitant price in a Western democratic country and sent your family to stay there, <br>" +
                    "In addition to doing your utmost best to secure citizenship for them in that country without avail, <br>" +
                    "And hire lobbyists from the same country with colossal sums of money   <br>" +
                    "You try to give the impression that you are indispensable, <br>" +
                    "Pretending to be the only patriotic citizen of your country, <br>" +
                    "And stifle dissent using all means you consider necessary, <br>" +
                    "Regardless of the ramifications <br>" +
                    "Your statements and deeds are in sharp contrast <br>" +
                    "They have incontrovertibly proven your selfishness, greed, grudge and malice <br>" +
                    "I treat your statement of intent as a hyperbolic one, <br>" +
                    "Because you are mortal and cannot live on earth for 400 years <br>" +
                    "But I would like to state without hesitation, <br>" +
                    "That there is every indication that you are obstinately determined to overstay your welcome and perpetuate yourself in power at all cost <br>" +
                    "Do you think you can fool us with your bluffs and make us believe credulously that you fear neither ballot nor bullet despite your conspicuous reluctance to play by the electoral rules and your numerous precautionary security measures? <br>" +
                    "If you really believe that democracy is not an ideal system of government and that Western democratic counties are too racist and xenophobic as you portray them, how come you trust such countries to the extent of purchasing an expensive property there, allowing your loved ones to reside there and employing their citizens as lobbyists with exceedingly-hefty salaries? <br>" +
                    "What makes you cherish the illusion that you are the only one capable of leading your country? <br>" +
                    "Are you a special breed? <br>" +
                    "Did you achieve anything extraordinary before you came to power that none of your compatriots ever achieved? <br>" +
                    "What supports your pretence that you are the only patriotic citizen of your country?" +
                    "Did you do anything good for your country before coming to power that no other citizen ever did? <br>" +
                    "Why are you too hostile to your opponents and always eager to victimize or even liquidate them?  <br> <br> " +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You adopted the catchphrase “transparency, accountability and probity”, <br>" +
                    "Chanting the slogan thunderously and monotonously at every opportune moment, <br>" +
                    "And later set up Commissions of Enquiry to investigate your predecessor and members of his regime, <br>" +
                    "Saying that you wanted to recover all the money and properties you claimed they stole while in office, <br>" +
                    "And promised to present the money and properties recovered to your compatriots at the end of the exercise and ask them how they wanted the “loot” to be used <br>" +
                    "But we haven’t heard anything on the matter from you since then <br>" +
                    "A prominent, popular, vocal and brave minister of the former regime has on several occasions challenged you to publish the report of the commissions for the world to judge but you remain mute <br>" +
                    "Why haven’t you published the report for the sake of transparency, accountability and probity?  <br>" +
                    "Is it that you haven’t recovered anything? <br>" +
                    "Is it that you have re-looted the loot? <br>" +
                    "Is it that you haven’t found anything implicating or incriminating? <br>" +
                    "Was the setting up of the Commissions of Enquiry not a mere pretext to justify your coup or enviously and begrudgingly witch hunt members of the former regime as observers have cogently argued? <br>" +
                    "Given the fact that you were as poor as a church mouse when you came to power and that you now behave as if you are richer than the state which you have overshadowed, do you consider it morally justifiable to punish members of the former regime or anyone else for corruption or embezzlement?  <br>" +
                    "Why have you jettisoned your motto “transparency, accountability and probity”? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You unreservedly condemned sycophancy, praise-singing and flamboyant lifestyle at the beginning of your reign, <br>" +
                    "Claiming that they characterized society and government when your predecessor was in power,  <br>" +
                    "Expressing your resolve and determination to bring “sanity” <br>" +
                    "You thus summoned, assembled, lambasted and shamed griots whose only “crime” was playing their socio-cultural roles, <br>" +
                    "Only to turn round and surround yourself with sycophants and flatterers who eulogize, aggrandize, glorify and mystify you,  <br>" +
                    "And cultivate the habit of dishing out astronomical amounts of money to musicians, filmmakers and writers who sing your praises and help you in your propaganda    <br>" +
                    "You frequently organize lavish festivals and ceremonies, <br>" +
                    "Besides buying extremely-costly vehicles <br>" +
                    "If you are confident and sincere as you want to make us believe, why do you need the services of sycophants, spin doctors and praise-singers?  <br>" +
                    "If you are compassionate and patriotic as you project yourself, why do plunder and squander the exiguous, direly-needed resources of the people you claimed you came to liberate and salvage?  <br>" +
                    "Why have you adopted the ostentatious lifestyle you denounced earlier? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You promised a thorough investigation after the gruesome, lugubrious murder of a minister who was serving in your government <br>" +
                    "Reports have it that you shed tears during your visit of condolence to the bereaved family, <br>" +
                    "Claiming that the deceased was a friend of yours <br>" +
                    "But we are yet to hear from you on the progress of the “investigation”, <br>" +
                    "And hence grow more and more impatient and suspicious of your implication or involvement in that horrendous murder <br>" +
                    "When are you going to shed light on that atrocious crime? <br>" +
                    "Have you really ordered an investigation to get to the bottom of the matter as promised? <br>" +
                    "If so, why allow the case file to gather dust in the drawers of the investigators? <br>" +
                    "If not, why have you chosen to let sleeping dogs lie? <br>" +
                    "How can you convince us that you have clear conscience about that heinous crime with your taciturnity on the issue? <br>" +
                    "Were your tears genuine? <br>" +
                    "Weren’t they crocodile ones as alleged by many?  <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You attempted to befriend the press during the early days of your coup, <br>" +
                    "Promising to co-operate with it, <br>" +
                    "Saying that journalists were free to criticize you where you went wrong <br>" +
                    "But your marriage with the press was ephemeral  <br>" +
                    "You impetuously waged a war against journalists, <br>" +
                    "Threatening to bury them six feet deep if they offend you, <br>" +
                    "And soon started persecuting them, <br>" +
                    "Lampooning them by calling them the “illegitimate sons of Africa” <br>" +
                    "Why this press-phobia and antagonistic attitude towards journalists? <br>" +
                    "Is it that you have something to hide? <br>" +
                    "Is it that you never go wrong? <br>" +
                    "Now that you have proven to be a nuisance, a menace and a disgrace to Africa by causing enormous damage, affliction and torment, do you maintain that journalists are the illegitimate sons of Africa?  <br>" +
                    "If so, what sort of African son do you consider yourself to be? <br>" +
                    "Do you still believe that journalists are more undesirable elements than you are as you erroneously believed? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You made an undertaking to electrify the whole of your country- even the rural areas, <br>" +
                    "Claiming that power outrage would soon be a thing-of-the-past, <br>" +
                    "After sprinkling “spiritual” liquid on newly-acquired generators <br>" +
                    "But we haven’t yet had adequate electricity supply in the urban areas, <br>" +
                    "Talk less of rural electrification which we now believe will only come as a miracle" +
                    "What is wrong? <br>" +
                    "Are you not willing to fix the electricity problem? <br>" +
                    "Do you lack the ability? <br>" +
                    "Have your demons or jinn betrayed you? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You announced the “discovery” of oil in your country long ago, <br>" +
                    "Brandishing a CD which you claimed contained information to that effect on your national TV,  <br>" +
                    "Promising to commence drilling the oil immediately and use its proceeds to transform your country from a begging-nation to a major-donor one<br>" +
                    "But the noise of the supposed oil discovery subsided soon after it started <br>" +
                    "An ex-ally of yours has told us that you didn’t even know how to operate a computer at the time of brandishing the CD, <br>" +
                    "And that he had learnt from your petroleum engineers that in fact the CD was empty" +
                    "True or false, a shrewd leader who is computer literate would ask experts to give a PowerPoint presentation, <br>" +
                    "Rather than just showing people a CD on the TV screen without allowing them to see its contents <br>" +
                    "If you have started exploiting oil, how far have you gone? <br>" +
                    "How do you utilize the proceeds? <br>" +
                    "Why were you in a hurry to make the announcement of the “discovery”? <br>" +
                    "Was that a political gimmick? <br>" +
                    "Did you fall victim of a scam? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You gave a pledge to build a state-of-the-art railway linking the capital of your country to the most distant town, <br>" +
                    "And provide high-speed trains to transport people and goods <br>" +
                    "But nothing has been said on the project since then <br>" +
                    "I am privy to the information that the leader of a landlocked country approached you, <br>" +
                    "With the intention of embarking on a railway project, <br>" +
                    "To facilitate the transportation of goods to his country by using your ports,   <br>" +
                    "As evidenced by the presence of that leader and his predecessor as high-profile guests during one of the anniversary celebrations of your coup, <br>" +
                    "Despite the fact that the latter was occupying a very high position at the African Union at the time and was a renowned, reputable democrat unlike you, <br>" +
                    "Leading observers to wonder why he accepted your invitation to grace the occasion <br>" +
                    "But you pretended to be the originator of the project for political gains <br>" +
                    "Are you still engaged in feasibility studies? <br>" +
                    "Would you help clarify matters? <br>" +
                    "Why this long silence? <br>" +
                    "Have the authorities of that landlocked country decided to abandon their plan? <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You made a promise to transform your country into an economic superpower during the celebrations marking your victory in the last presidential election, <br>" +
                    "Saying that you gave a three-year notice period to countries like Dubai and the United Arab Emirates, <br>" +
                    "Asserting that your country would outstrip or surpass them and no-one would talk about them in terms of development any longer, <br>" +
                    "And that all the talk would be about the rapid, considerable development of your country <br>" +
                    "But you later said while addressing youths that you intended to develop your country to the maximum but lacked the means to do so, <br>" +
                    "And that you fervidly wished you could <br>" +
                    "Point of observation! <br>" +
                    "Dubai is not a country- not even the capital of a country, <br>" +
                    "But the name of an emirate and a city in the United Arab Emirates <br>" +
                    "Coming back to your lofty “goals”, I would say that it may be good to aim high but imprudent, unwise or foolhardy to make empty promises, build castles in the air or set unachievable goals <br>" +
                    "Have you now realized that you cannot transform your country into an economic superpower and develop it more that the United Arab Emirates or Dubai Emirate/City in three years? <br>" +
                    "What was the basis of your promise?  <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You vowed to combat and curb drug peddling and consumption following the discovery of tons of hard drugs in your country <br>" +
                    "But you later instructed your rubberstamp National Assembly to decline the offer made by a foreign country to partner with your country to combat drug trafficking in its waters  <br>" +
                    "The puppets among the members of the National Assembly obeyed blindly as usual," +
                    "Claiming that the proposed bilateral agreement did not favour your country, <br>" +
                    "Despite the alarmingly-high number of drug related cases reported in your country in recent years, <br>" +
                    "Pretending that they acted independently in the best interest of their country and people by repudiating the draft bilateral agreement <br>" +
                    "Your behaviour has led many people to believe that you have ulterior motive <br>" +
                    "I am not the least convinced that those members of the National Assembly acted  freely or independently in the interest of their country and people as they wanted to fool us into believing <br>" +
                    "They feel that they owe you an obligation as their master and thus care more about your interest than that of the electorate <br>" +
                    "This is evidenced by their eagerness to ratify controversial bills or agreements that clearly seek to defend your personal interest or guarantee your security to the disadvantage of the populace <br>" +
                    "Chief among them is the bill granting blanket immunity to the cruel killers of innocent, unarmed children in April 2000, <br>" +
                    "The bilateral agreement written in Spanish which was sent to the National Assembly   for ratification unaccompanied by an English translation, <br>" +
                    "And the Information and Communication Act which was amended recently with the ultimate goal of entrenching and eternizing you in power by intimidating and neutralizing your critics and opponents      <br>" +
                    "Some members of the opposition at the National Assembly voiced their concern in all cases and cautioned their colleagues but to no avail <br>" +
                    "Do you have an axe to grind vis-à-vis the foreign policy of the country that offered to work with your country in the crusade against drug trafficking? <br>" +
                    "Why didn’t you seize the opportunity accorded to you if you truly want to see your country free of drugs as you claimed previously? <br>" +
                    "Why did you rebuff the proposed partnership in the war on drugs if you don’t have vested interest in the drug business? <br>" +
                    "How can you debunk or convincingly dismiss the widespread allegation that you are involved in drug trafficking after turning down the offer?  <br> <br>" +
                    "" +
                    "Hi Jammeh! <br>" +
                    "You promised your compatriots hell-on-earth on the eve of your inauguration after the presidential election, <br>" +
                    "Telling them that they would see a different type of a leader in you, <br>" +
                    "As there would be no more mercy or compromise, <br>" +
                    "But harshness and toughness, <br>" +
                    "And later threatened to execute death row inmates <br>" +
                    "Incredible but true! <br>" +
                    "These promises have been fulfilled with rapidity and exactitude <br>" +
                    "Many people have been fired, arrested, detained, jailed or fined heavily  <br>" +
                    "Death row inmates have been slaughtered, including ex-soldiers who allegedly had attempted to overthrow your regime, <br>" +
                    "And media houses have been closed <br>" +
                    "Why have you failed to honour the good promises you have made but wasted no time to carry out the negative ones? <br>" +
                    "Are you better at marring than making? <br>" +
                    "Are you better at destroying than building, put in simple terms? <br>" +
                    "Don’t you think fulfilling negative promises while failing to honour good ones undermines your credibility as a self-proclaimed patriot? <br>" +
                    "Don’t you think your behaviour has nullifying effects on your reputation? <br>" +
                    "Do you think your image-makers and propagandists can succeed in their unwavering, unflinching endeavours to purify or market you if you continue to wallow in the mud or behave monstrously and mischievously? <\font> <br>"

            ,
            "<font color=\"black\"><b>Conflicting Remarks From Yahya And Susan: Who Is Wrong? </b> <br> <br>" +
                    "" +
                    "The remarks made recently by the Gambian leader Yahya Jammeh and Foreign Affairs Minister Honourable Susan Waffa-Ogoo vis-à-vis the EU (European Union) are conflicting and irreconcilable. The former castigated the EU and trivialized its financial aid to The Gambia by downgrading it to chicken change, whereas the latter spoke eulogistically of the same EU for its support calling it a true development partner of The Gambia. Which is which? <br> <br>" +
                    "" +
                    "If you could recollect, Jammeh reacted angrily, rashly and harshly to the demands of the EU pertaining to rule of law, human rights and freedom of expression. In his tirades at a cabinet meeting, Jammeh rejected the demands flatly saying that he had nothing to discuss with the EU. He ranted at length branding the members of the EU neo-colonialists. He accused them of trying to export the practice of homosexuality to The Gambia vowing that he would never allow them to use their chicken change to impose their will on him, that he would not dance on broken bottles because of that chicken change, that he didn’t care about the EU and that the EU could go to hell. In short, Jammeh blew the issue out of proportion to earn public sympathy. He told his ministers that anyone among them who agreed with the demands was free to resign straightaway.  That cabinet meeting was followed by mobilization of people to express solidarity with Jammeh in his defiant stance on the matter. A solidarity march was hastily organized. Jammeh’s wailers whinged lengthily during the march chanting anti-Western slogans. Some overzealous supporters claimed that they were ready to die in Jammeh’s place if he was faced with death. Addressing a cheering crowd, Jammeh farcically, absurdly, ineptly, ludicrously and ridiculously claimed that he had chosen to be born after The Gambia gained independence from Britain, implying that he detested being born during the colonial era. Letters of solidarity were published prolifically in the Daily Observer newspaper of The Gambia.  <br> <br>" +
                    "" +
                    "Contrary to what Jammeh said, Madam Waffa-Ogoo praised the EU highly while speaking at a ceremony marking Europe Day. She qualified the EU as a genuine development partner of The Gambia, substantiating her statement with the fact that the “financial support provided by the EU has enabled The Gambia government to implement its development programmes.” She elaborated saying that the Gambia government was able to implement programmes in its key sectors of agriculture, heath and education due to budgetary support packages from the EU, of which, according to her, the government was appreciative. <br> <br>" +
                    "" +
                    "The questions arise now: Was the honourable minister speaking on her own behalf or on behalf of the Gambia government which is headed by Yahya Jammeh? Who is wrong regarding the financial support given to The Gambia by the EU, Jammeh or Madam Waffa-Ogoo? Where does Jammeh stand now? What is the feeling of those who supported Jammeh’s stance concerning the EU demands? <br> <br>" +
                    "" +
                    "The fact that the Gambia government has not dissociated itself from the minister’s remarks strongly suggests that the minister made the remarks on its behalf or that it doesn’t disapprove of them. It can be deduced that the honourable minister was instructed by her boss Jammeh to speak that way. Many people believe that Jammeh had realized his blunder and thus decided to seize the opportunity to pacify or appease the EU as a way of seeking reconciliation with it through the minister. Going by this line of reasoning, one can draw a conclusion that Jammeh is now prepared to dance inside a tank full of boiling tar so that he can continue enjoying the financial support of the EU. In other words, Jammeh is willing to bow down after his invectives. His sycophants must feel deeply embarrassed by his posture of angry defiance and sudden u-turn. I exhort them and their master to use the maxim “Look before you leap” as a guiding-principle. In so doing, they will save themselves from committing fatal blunders, causing irreparable damage and transforming themselves into objects of ridicule. Based on Jammeh’s silence over the polite, placatory remarks made by the honourable minister, which are in sharp contrast with his uncharitable, taunting remarks, one can confidently say that he is wrong and she is right. The financial support of the EU is no chicken change as Jammeh claimed. In fact, it is considerable and commendable as Madam Waffa-Ogoo rightly said. It doesn’t take one to be an economist or an expert in finance to know that The Gambia is not rich in natural resources or financially strong enough to fund the development projects implemented under Jammeh by itself. At the aforementioned ceremony, an EU representative highlighted the support of the EU to The Gambia and asserted that the EU is the biggest donor to The Gambia without being challenged by any government officer. Hence, it is abundantly clear that the development projects enumerated by Jammeh every now and then to earn the love and support of Gambians are mostly or largely funded by the EU which he lambasted for telling him to stop oppressing Gambians and treat them with mercy, justice and fairness. Jammeh should be ashamed of brutalizing his own people to the extent of being asked by outsiders to desist from his abominable, abhorrent acts of oppression. Although it can be argued that some members of the EU owe us apology or compensation for colonizing or exploiting us, we should thank the EU for contributing to the socio-economic and infrastructural development of our country and defending our rights or, at least, refrain from discouraging it. I am not, in anyway, suggesting that we should fold our arms and expect the EU or other donors to cater for our development needs continuously. Superfluous to say, we should try our best to attain self-sufficiency and self-reliance in as many sectors as possible rather than pinning our hopes entirely on outsiders all the time. We should also learn to put the financial aid we receive from donors into good use and avoid waste or expenditure on misplaced priorities as Jammeh does by dishing out astronomical sums of money to praise-singers, spending lavishly on festivals, ceremonies and competitions, and sponsoring propaganda projects.   <br> <br>" +
                    "" +
                    "It is worthy to point out that Jammeh is the very one inviting trouble and tarnishing the image of The Gambia through his indecorous, uncouth utterances and obnoxious acts which scare away prospective investors and tourists, not those he and his sympathizers label as trouble-makers, spoilers and haters. He is the one antagonizing and alienating donors, not his perceived opponents, rivals or enemies. Evidently, Jammeh is wooing his own destruction and that of our beloved country. Therefore, he should refine his speaking style, change his uncultured, uncivilized manners and behave maturely and responsibly like a head of state who is worth his salt, bearing in mind that it doesn’t pay or tell well of him to use vulgar, provocative language or abuse his power by maltreating the people whose interest he has sworn to serve. If the damage is not already past repair, this is the only tactic Jammeh can use to manoeuvre his way out of the awkward situation in which he is found at the moment. No gimmick or propaganda can help.<\font>   <br> <br>"

            ,
            "<font color=\"black\"><b>Fourth Rejoinder: Debunking Sarr and Jammeh </b> <br> <br>" +
                    "" +
                    "Brother Samsudeen Sarr, I wholeheartedly accept your apology for the delay in reacting to my previous rejoinder. Better late than never! I am highly indebted to you for reviewing my theory and giving me your feedback, though the feedback is negative as expected. <br> <br>" +
                    "" +
                    "Mr Sarr, it is a pity that you are behaving like those the glorious Qur’an has described as deaf, dumb and blind. Instead of addressing issues accordingly, you have resorted to your customary digressions, mystifying, glorifying and aggrandizing your master, while- the same time- flaying my Imam and the US government as usual. You have proven to be a dangerous, undesirable element that should be edified more, or filtered out like germs in water. It seems you are walking on your head. If so, I appeal to you to stand up and walk on your feet, and reason with me. <br> <br>" +
                    "" +
                    "Your dismissal of my formula as “un-mathematical” doesn’t bother me the least. The formula is meant to illustrate the predictable aspect of Jammeh’s character, and I believe it serves the purpose well. It is gratifying that you have not disputed the attributes of betrayal and bully which I have said are inherent in Jammeh. This strongly suggests that you agree with me on this point, or that you know deep in your heart that Jammeh is a betrayer and a bully, even though you lack the sincerity and courage to say it. <br> <br>" +
                    "" +
                    "You have branded your anonymous critics cowards, challenging them to come in the open. Mr Sarr, you are not morally justified in labelling those people as cowards for concealing their identities. It is common knowledge that you have written prolifically lambasting Jammeh under the pen name Ebou Colley. Were you a coward then? When have you become a “hero”? What is the source of your “bravery”? As I have said in one of my recent write-ups, people have different reasons for using pseudonyms. I have never used pseudonyms, I but respect the position of those who have chosen to use them. The message conveyed by a writer is more important than his/her identity. If you think that those anonymous critics are not talking sense, you are free to go ahead and refute or disprove what they say about you and your master, just as people used to do with you when you were writing pseudonymously as Ebou Colley. <br> <br>" +
                    "" +
                    "Given the manner in which your master treats his associates, your job as a diplomat is not as lucrative and enviable as you consider it to be. Therefore, it is utterly wrong for you to believe that people begrudge you the opportunity to get appointed to that post by your master. I mentioned luxurious, flamboyant lifestyles as the motivating-factor factor of your reconciliation with your master. This was in response to your description of my Imam as an “eminent loser”.  Put in crude terms, I believe it is better to live and die with dignity as a loser (poor person) than to live as a liar- like you- with the aim of leading a luxurious (expensive/lavish), flamboyant lifestyle like your master.  No one is convinced that your reconciliation with your master is genuine. The general belief is that you have mortgaged your dignity- if at all you initially had any- and lent yourself to the services of the despot in order to better your situation, and not to serve the interest of your country as you want to fool us into believing. As I told you earlier, Jammeh is not as foolish as you think. He understands you very well. He is just playing his cards, as you are doing. He always says “Once a soldier always a soldier.” Thus, he knows that once a liar always a liar. I very much doubt whether you will be able to outwit or outsmart him as intended. It is foolhardy for you to think that you can. I have the conviction that your master will ultimately triumph over you, not the other way round. To me, your best deal will be a win-win situation, which I rule out in its totality. As we all know, partnering with your master as an individual rarely lasts long, and he emerges victorious in most cases.  Partnering with him is comparable to caressing a porcupine, as anybody who does that is bound to get pierced and hurt by the sharp quills on its body. <br> <br>" +
                    "" +
                    "It is heart-breaking that you are trying to downplay the seriousness of the heinous crime of massacring 14 youths and 54 foreign nationals in 2000 and 2005 respectively, under your master’s watch. You have maintained your position that your master is a security genius, claiming that the killing of the 14 youths would not happen if he was present in the country at the time of the riot. If your master was a security genius as you have claimed, he would be able to put in place a good security apparatus to make sure that such a catastrophe is averted, regardless of whether he was in or outside the country. Besides, he would communicate with the security forces on the ground and advise them to take good measures that could help them to avoid killing. If your master was communicating with the security forces while abroad, it can be concluded that the command to kill the youths emanated from him as many people have alleged. This allegation is supported by the fact that he indemnified the killers rather than punishing them as expected of him. Your master’s decision to indemnify the killers can be interpreted as giving the security forces the licence to kill protesters as a way of suppressing demonstrations and quelling riots. Evidently, your master is not a conscientious security genius, if at all he is one. Your assertion that your master has compensated the families of the victims and that they are “genuinely satisfied” is disputable. How have you reached that conclusion? Have you interviewed them? For your information, Mr Sarr, some of the survivors of the calamity are still on wheelchair, and your master is not doing anything to help assuage or attenuate their plights, in spite of the fact that he is always dishing out astronomical sums of money to wrestlers, artists and dancers. Hence, his generosity- which you have highlighted in your rebuttal- is gravely misplaced. What is the logic, if at all there is any, behind showing generosity to the latter while ignoring the former who had been maimed by his security forces? Is this a way of telling them that he his angry with them and thus want to see them suffer for the rest of their lives? You have claimed that Gambian students, after the brutal killing and mutilation of their colleagues, organized a solidarity march to manifest their love and support for your master. Mr Sarr, stop treating Gambians as credulous fools. We all know that such so-called solidarity marches are not voluntary. They are state-managed through mobilization by APRC bigwigs. Your claim that the students were instigated by the opposition for the purpose of destabilizing the country and eventually seizing power is unfounded. You are seeking to please your master by re-echoing what he and his marionettes have already said. The students were protesting the murder and rape of their colleagues by officers of the Fire and Ambulance Services and the security forces. Therefore, their cause was genuine. The security forces should have escorted them and use tear gas or rubber bullets to control them during the riot rather than shooting them with live bullets. It doesn’t take one to be a security genius or guru to know these basic security measures. Mr Sarr, be fair, honest and sincerely with Gambians and stop blaming your master’s multifarious wrongs and misdeeds on them all the time. No wonder, you have denied the killing of 54 foreign nationals, asking for evidence and a list of the names of the victims. The evidence is that your master had reached a deal with the Ghana Government and paid compensation to the families of the victims. This was reported widely by the Ghanaian press (print and online), and The Gambia Government never denied it, although they chose to keep Gambians in the dark as usual by refraining from reporting it as expected of them. According to vibeghana.com (11 November 2011 edition), US$ 500,000 was paid by the Gambia Government. Why would your master pay compensation if no Ghanaian was killed as you have claimed? Paying compensation simply means confession. In fact, independent investigators were sent to The Gambia prior to that. Mr Sarr, I cannot believe that you are not aware of the investigation and compensation. Besides, a survivor called Martin Kyere has narrated his ordeal on Joy FM (myjoyonline.com) in Ghana. What more proof do you want? Mr Sarr, you have transformed yourself into a clown through your denials of the obvious. Even your master and the APRC praise-singers and puppets you are trying to impress know fully well that you are not talking sense. Like your master, you have turned yourself to an object of ridicule and a laughing stock globally. Additionally, you have incurred the wrath of all right-thinking people through your behaviour. This is the price of sycophancy and opportunism. <br> <br>" +
                    "" +
                    "In your silly, senseless and vain attempt to justify your master’s atrocities, you have drawn my attention to the recent bombing of a hospital in Afghanistan by an American fighter aircraft, resulting in a mass killing of civilians. That is deplorable, and I condemn it with the strongest possible terms. However, you should note that this incident cannot, in any way, justify the killing of 14 armless, harmless youths by the Gambian security forces. Two wrongs cannot make a right. If you are so concerned about this incident, I see no reason why you should play down the killing of 14 youths in your native country. Your hypocrisy and insincerity are conspicuous, and have proven to be beyond dispute and measure. <br> <br>" +
                    "" +
                    "You are still insisting that my Imam should have limited his sermons to religious issues and refrained from talking about politics. Yet, have told us that you can endorse your master as a head of a secular state as well as a religious state. If you can draw a clear demarcation line between religion and politics for my Imam, why can’t you do the same thing for your master? Jammeh has meddled in religion to the extent of decreeing for Muslims when to perform Eid prayers. He has persecuted and prosecuted a religious leader for disobeying his orders in this regard. If you believe that a religious leader should not meddle in politics, it is logical for you to also believe that a political leader should not interfere in religious matters as your master does on a daily basis. Now, would you tell Jammeh to limit himself to political issues and stop meddling in religion? Mr Sarr, sermons are meant to address issues affecting people. Be those issues religious, political, social, cultural, and otherwise. Given the importance of politics and the fact that Islam is a way of life, it doesn’t make any sense for you to suggest that no sermon should touch on political issues. Put that into your head! <br> <br>" +
                    "" +
                    "You have portrayed Jammeh as the saviour of our dear Motherland. There is nothing further from the reality than this portrayal of your master. This is insulting to the intelligence of Gambians, to say the least. The Gambia is no longer the Smiling Coast it used to be. It can aptly be called the Frowning Coast or the Weeping Coast under Jammeh. I am talking about a situation where people live constantly in a state of fear due to repression and oppression. Mysterious killings and disappearances without trace have become the order of the day. Prices of commodities and utility tariffs are sky-rocketing, coupled with economic slump evidenced by the rapid depreciation of our currency. Poverty and youth unemployment are on the rise, forcing our youths to risk their precious lives to travel overseas by all means in search of greener pastures. We have been categorized as a Highly Indebted Poor Country (HIPC). Despite our heavy, neck-breaking debt burden, our government continues to borrow and never hesitates to ratify loan agreements, no matter what conditions are attached. For this reason, we have now reached a point of insolvency, and our only hope of salvation is debt relief. To better understand our financial/economic situation as a country, Mr Sarr, you can read the recent IMF report if you have not already done so. But don’t try to rubbish it as you have done with the Human Rights Watch report. Your master has, on several occasions, promised to transform our country into an economic super power and a donor country, claiming that it would soon outstrip Singapore and the United Arab Emirates in terms of development. As I always say, Mr Sarr, it is good to aim high, but it if folly to set lofty, unachievable goals. That is daydreaming and fantasizing, or building castles in the air, as others would put it. Mr Sarr, people are not gullible to extent of believing your master’s endless empty promises and your unsubstantiated claims of better living conditions under him as a leader. The era of hoodwinking people is past and gone. The fact of the matter is that Jammeh is more interested in enriching himself than in alleviating the poverty bedevilling our country and enhancing the wellbeing of its citizens. That Jammeh can donate vehicles and equipment to government departments and has the guts to tell his compatriots publicly that he has accumulated enough wealth to cater for the needs of his great grandchildren has said it all. He has become richer than the state overnight. This is more than yabaateh and heibaateh combined, Mr Sarr.  In summary, Jammeh is not a saviour as you have tried to project him. He is a plunderer and squanderer, a betrayer and a bully. Pure and simple! <\font>    <br> <br>" +
                    "" +
                    ""
            ,
            "<font color=\"black\"><b>Dialogue-With-The-People Tour: What A Misnomer! </b> <br> <br>" +
                    "" +
                    "What a misnomer! <br>" +
                    "There is so much controversy over your recently concluded nationwide tour dubbed Dialogue-With-The-People Tour <br>" +
                    "Many people argue that the name is a misnomer, <br>" +
                    "Judging by the invectives, vituperations, threats and rash, unilateral and contentious declarations that characterized the tour, <br>" +
                    "And suggest changing the name to a more suitable one <br>" +
                    "I therefore propose that we call it Castigation-And-Declaration Tour,  <br>" +
                    "Which I believe to be more appropriate <br> <br>" +
                    "" +
                    "What a misnomer! <br>" +
                    "You uncharitably criticized, castigated and caricatured the former and current presidents of our neighbouring country, <br>" +
                    "Calling the latter a puppet and an incompetent, unqualified head of state, <br>" +
                    "Saying that you can’t get along with him, <br>" +
                    "And that you couldn’t work with his predecessors <br>" +
                    "His compatriots felt offended and flew into a rage, <br>" +
                    "And thus denounced your outrageous remarks in unison, <br>" +
                    "Reminding you of your responsibilities as head of state and the gross,  <br>grave human rights violations you have shamelessly and remorselessly perpetuated against your own compatriots <br>" +
                    "Cautioning you to concentrate on your work and desist from meddling into the affairs of their country <br>" +
                    "I quite concur with them <br>" +
                    "Your irresponsible, provocative remarks have the danger of souring the fraternal relation between our countries, <br>" +
                    "And engendering hardship and suffering for their dwellers  <br>" +
                    "If you have a problem with your counterpart, you should try to resolve  the matter through diplomatic channels rather than lambasting him and his predecessors publicly <br>" +
                    "That you have blamed those three heads of state for your inability to work harmoniously with them shows that you are awkward and uncooperative, <br>" +
                    "And lack the courage to accept your weakness as a leader <br>" +
                    "The proverb “A bad worker always quarrels with his tools” befits you <br>" +
                    "Your unscrupulous chief spin doctor and flatterer has made an attempt  to defend you by calling your silly, infantile remarks frank talk, <br>" +
                    "Praising you as usual for having the audacity to address your counterpart in such a harsh manner <br> <br>" +
                    "No wonder! <br>" +
                    "As he pretends to see sense in all your utterances and acts, no matter how nonsensical they are <br>" +
                    "But other sycophants haven’t lost sight of the gravity of your foul language <br>" +
                    "Hence, they have tried to downplay your vexatious remarks in their defence by calling them a joke <br>" +
                    "These differing positions taken by your blind supporters have amply demonstrated the absurdity, irrationality and illogicality of your remarks <br>" +
                    "They have also proven beyond reasonable doubt the insincerity and dishonesty of your apologists, <br>" +
                    "And the impossibility of defending you or justifying your reckless utterances <br> <br>" +
                    " " +
                    "What a misnomer! <br>" +
                    "You branded members of a certain region tribal bigots, <br>" +
                    "Saying that tribalism is unacceptable to you, <br>" +
                    "Vowing to combat it by all means <br>" +
                    "But you habitually make venomous, inflammatory tribal remarks, <br>" +
                    "And castigate the members of the biggest tribe in our country, <br>" +
                    "Leading people to believe that you unjustifiably and unreasonably bear  grudge and malice against them <br>" +
                    "Thus, you have no moral authority to preach against tribalism <br>" +
                    "Put in crude terms, you don’t practise what you preach, <br>" +
                    "Nor do you lead by example <br>" +
                    "You also accused members of other regions of killing their own people through sorcery or witchcraft, <br>" +
                    "Claiming that their relatives in the Diaspora are now afraid to go home due the “practice”, <br>" +
                    "And warned the alleged culprits, <br>" +
                    "Threatening to take drastic measures against them <br>" +
                    "Prior to making such utterances, you said people should have faith in  <br> God and believe in predestination  <br>" +
                    "Your remarks are conflicting <br>" +
                    "You cannot have faith in God and believe in witchcraft at the same time <br>" +
                    "If you really had faith in God and believed in predestination, you wouldn’t ascribe or attribute deaths to sorcery <br>" +
                    "People from the areas you accused of practising witchcraft have vehemently denied the killings you claimed, <br>" +
                    "Contending that they are the figment of your own imagination <br>" +
                    "Your firm belief in witchcraft runs counter to your claim to espouse the concept of Pan-Africanism <br>" +
                    "A self-proclaimed Pan-Africanist labelling Africans witches and wizards! <br>" +
                    "What would you say if the accusation came from the Whites whom you and your spin doctor call racists and haters? <br>" +
                    "What hypocrisy! <br>" +
                    "What a fake Pan-Africanist! <br>" +
                    "You chastised women who wear dresses you deem indecent or inappropriate, <br>" +
                    "Those who bleach their skins,  <br>" +
                    "And those involved in other practices you consider to be malpractices, <br>" +
                    " Using extremely derogatory, disparaging remarks <br>" +
                    "Your utterances are discordant and incompatible with your position as head of state <br>" +
                    "You manifested your sheer lack of respect for women through your abusive language <br>" +
                    "It beats people’s imagination that you can address women in such a disrespectful, discourteous and impolite manner, <br>" +
                    "Given your claim that women are your support base, <br>" +
                    "And the fact that they are dignified and honourable  <br>" +
                    "You could convey your message without resorting to the use of vulgar language or profanities <br> <br>" +
                    "" +
                    "What a misnomer! <br>" +
                    "You declared a ban on female circumcision otherwise known as female genital mutilation (FGM), <br>" +
                    "Claiming that you had discovered after a “thorough research” that the practice is wrong from both the Islamic and scientific perspectives <br>" +
                    "You said in obscene language that you would deal drastically with any religious leader who dares to defy the ban, <br>" +
                    "Threatening to punish circumcisers and parents of would-be victims ferociously <br>" +
                    "Your declaration has been received with mixed feelings and reactions <br>" +
                    "Many have hailed it as a bold, welcome move, <br>" +
                    "Heaping praises on you <br>" +
                    "Some see that the ban had long been overdue,  <br>" +
                    "As you have supported the practice for over two decades, <br>" +
                    "During which period you persecuted those who campaigned for its abandonment, <br>" +
                    "Including a prominent religious leader who voiced his aversion and opposition to it from the Islamic point of view <br>" +
                    "Others have opined that the declaration should have been preceded by legislation, <br>" +
                    "Arguing that you behave as if your words are more powerful than the laws enshrined in the constitution of our country <br>" +
                    "Many people believe that you have made the decision just to appease and woo Western donors, <br>" +
                    "With the aim of manoeuvring your way out of the dire financial situation in which you have found yourself <br>" +
                    "Whatever the case may be, your threats and insults are uncalled for <br>" +
                    "You should treat those parents as you treat your own parents and want people to treat them <br>" +
                    "The religious leaders you insulted are the very ones whose advice you claimed you relied on while supporting the practice <br>" +
                    "You have proven your chief spin doctor wrong and vindicated the only religious leader- an eminent Imam- who campaigned vigorously and openly against FGM  <br>" +
                    "Your chief spin doctor recently criticized that distinguished Imam severely while defending you, <br>" +
                    "Contending that the Imam couldn’t be right in his defiant positions vis-à-vis your decisions, <br>" +
                    "As he was the only one among the lot to challenge your decisions <br>" +
                    "The verdict of time has come with your declaration banning FGM <br>" +
                    "I call on the spin doctor to muster up his courage- if at all he has any and come out and tell us where he stands now <br> <br>" +
                    "" +
                    " What a misnomer! <br>" +
                    "You stunned and stupefied your audience and the entire nation by declaring our country an Islamic state at one of your rallies <br>" +
                    "You tried to allay fears by saying that members of other faiths would be allowed to continue to practise unhindered, <br>" +
                    "That you had not appointed anyone Islamic police officer, <br>" +
                    " And that no one should seize the opportunity to interfere in the way Muslims comport themselves or tell them how to dress," +
                    "As the way people dress is no one’s business <br>" +
                    "Your sycophants have applauded the declaration as expected of them, <br>" +
                    "Contending that it should be accepted in good faith as the vast majority of the population are Muslims, <br>" +
                    " And that they see no reason why a Muslim should oppose the move  <br>" +
                    "On the contrary, some people have advanced the argument that the declaration is untenable as our country is a secular state, <br>" +
                    "And that it is null and void as it violates our constitution <br>                           " +
                    "Many believe that there is ulterior motive behind the declaration" +
                    "Some people see it as a cheque book declaration or declaration for cash, <br>" +
                    "In other words, they believe that you want to fool rich Muslim countries for monetary gain <br>" +
                    "Other cons of the declaration say that you should be among the first batch of people to be lashed, stoned or executed if our country is transformed into a genuine Islamic state <br>" +
                    "I believe your chief spin doctor and other praise-singers and flatterers will suffer the same fate as you <br>" +
                    "The fact that you want to be selective in the implementation of laws in the Islamic state you envisage has clearly demonstrated your lack of seriousness and sharp contradiction in your remarks, <br>" +
                    "Besides, it strongly suggests that the country will be an Islamic state only by name if transformed <br>" +
                    "How can you censure women for “dressing inappropriately” and turn round and say that Muslim women should not be told how to dress when an Islamic state is established? <br>" +
                    "Will you stop organising dances, beauty contests and festivals during which men and women mingle freely if you succeed in establishing an Islamic state? <br>" +
                    "Will you abandon your practice of mysticism which your spin doctor has told us you steadfastly believe in? <br>" +
                    "Your selectivity and contradictory, irreconcilable remarks lend credence to the widely held belief that your declaration is meant merely to line your pockets, and not to set up a true Islamic state <br>" +
                    "This selectivity has been condemned by Allah as “accepting/practising some parts/aspects of The Book (The Holy Qur’an) while rejecting others” <br>" +
                    "The fact of the matter is that we are more concerned about the bad manner in which you treat us than the secular nature of our country <br>" +
                    "We prefer a secular state where our God-given, constitutional rights are respected and our precious lives valued to an Islamic state headed by a person who has no regard for human rights and cares less about human lives    <br>" +
                    "We hope and pray for your quick departure so that we can live in peace and harmony " +
                    "Vamoose! <\font><br>" +
                    ""
            ,
            "<font color=\"black\"><b>Perpetuation of Dictators: What Factors Are Responsible? </b> <br> <br>" +
                    "" +
                    "It is common knowledge that many dictators succeed in being perpetuated in power contrary to the wishes of their opponents and the earnest efforts made to depose them. This phenomenon leads many people to believe or argue that those dictators are intelligent, wise, brave and patriotic citizens who are loved by their compatriots. Hence, the question arises: What factors are responsible for the perpetuation of dictators in power? To answer this question, I would say that the factors responsible for entrenching or keeping dictators in power are many and varied, chief among them the ones enumerated and discussed below:  <br> <br>" +
                    "" +
                    "1.\tSelf-mystification/Self-glorification <br>" +
                    "Some dictators behave as quacks or impostors. They always try to give the impression that they have supernatural or magical powers and are endowed with knowledge in everything. They go to the extent of pretending to communicate with demons, or even give them instructions. To portray themselves as courageous or brave, invincible leaders, they always castigate journalists, human rights defenders and people regarded as democrats, telling those who care to listen to their rhetoric that they fear no one on earth and that they don’t care about their critics or what people they term as their detractors or enemies say about them. They sometimes address experts/professionals as if they are giving them lectures in their own domains. They do this with the intention of fooling people into believing that they know better than those experts/professionals in their respective areas of expertise or specialization. Such dictators are so obsessed with titles, and hence accumulate accolades to the extent of subjecting themselves to ridicule globally. They have their statues or photos displayed everywhere, particularly in public places and offices. The motive behind all this is to frighten or scare people away and manifest self-importance or supremacy. <br> <br>" +
                    "" +
                    "2.\tReligious Gimmickry <br>" +
                    "The use of religion as a political card is common among dictators. The dictators involved in this gimmick try to portray themselves as pious people through their appearance and utterances. In some cases, those dictators fund religious projects and activities or sponsor religious adherents to perform religious rites. They even organize religious ceremonies in some instances. <br> <br>" +
                    "" +
                    "3.\tUse of Threats <br>" +
                    "To intimidate people as a way of controlling them or making them do or behave as they wish, some dictators resort to issuing threats. Those dictators are fond of making utterances such as: “Anybody who does……will face the consequences.” “I will not allow anybody to ……” “I will not compromise……” “You will be buried six feet deep if you…….” “We will swim in a pool of blood if you dare…….” “Know that you are playing with fire if you……” “I can kill ten thousand people and go and sleep if I have to.” “You will be sacked if you…..” “Don’t expect development if you don’t vote for me.”   <br> <br>" +
                    "" +
                    "4.\tPersecution <br>" +
                    "Persecution is a very common tool used by dictators to stifle dissent or make people subdue. This includes state sponsored terrorism in the form of arson attacks on media houses, abduction, torture, arbitrary arrest, illegal detention or incarceration, assassination, forcing people to drink intoxicating, hallucinogenic or poisonous concoctions with the silly belief that they are witches/wizards,  and the like. Dismissing public servants at random and bringing flimsy charges against opponents or perceived enemies also constitute political persecution. <br> <br>" +
                    "" +
                    "5.\tPersonalization/Monopolization of Public Properties <br>" +
                    "Personalizing or monopolizing public properties facilitates the perpetuation of dictators in power, as it allows them to control their people. Thus, there is very little or no distinction between state properties and the properties of the leader in most dictatorial states. The leader is synonymous with the state. In other words, the leader is the state and the state is the leader. The leader uses state properties/resources according to his whims and caprices. He overshadows the government, and that leads to a situation where whatever good the government does is attributed to him as a person. It is the leader who finances government projects, sponsors state events, donates vehicles, equipment and materials to government institutions, gives scholarships to students, and supports the poor and the needy. The list is interminable. The state media is transformed into a propaganda tool for the leader. It is always used to glorify or mystify the leader and demonize or defame members of the opposition who are never given the opportunity to defend themselves or refute the blistering criticism launched against them on daily basis, let alone allowed to use it for propaganda purposes. <br> <br>" +
                    " " +
                    "6.\tFavouritism <br>" +
                    "Dictators habitually remunerate those they believe are loyal to them and always ready to carry out their instructions without hesitation or eagerly do the dirty job for them. The incentives dictators use in this regard can take the form of appointment or promotion to high, prestigious positions or ranks, sponsorship for further education or training, pay rise or salary increase, etc. Luxury houses or vehicles are also used as incentives. Most people in this category serve as willing collaborators for the simple reason that they know they are unqualified to man such positions of responsibility and enjoy the privileges associated with them under normal circumstances by virtue of their low educational/professional level or poor training. <br> <br>" +
                    "" +
                    "7.\tReligious/Professional/Intellectual Dishonesty <br>" +
                    "It is a pity that some religious leaders, professionals and people who are regarded as intellectuals wittingly play crucial roles in strengthening the hands of the devils, disregarding the fact that national interest supersedes personal or group interest. These people are blinded by their lust for material resources, prestige or status, for which reason they reduce themselves to tools of dictators. The religious leaders involved in this dirty game would not mind accompanying a dictator during political campaigns, making citations from the Holy Scriptures in an attempt to repair his battered image, or serving as errand boys for him. They always heap praises on the dictator or go the extra mile of bestowing religious titles on him, despite their full cognizance of his gross, blatant violations of the teachings of their religion. Some professionals and people regarded as intellectuals use their expertise or knowledge to help dictators to control state properties/resources, defraud their nations, suppress their people or frame, incriminate or eliminate innocent citizens perceived as enemies. They also shamelessly try to justify or defend the blunders, misdeeds or wrong doings of dictators. Thus, it is not the least surprising to see the constitution amended in favour of the leader every now and then in countries ruled by dictators. Nor is it a surprise to see the proliferation of letters, poems, or even voluminous books singing the praises of the leader.  These puppets, sycophants and opportunists are more dangerous and worse than the dictators they help to eternize their stay in power, one can say courageously- and rightly for that matter. These dupes are undesirable elements. Through their nefarious, obnoxious acts, they totally betray the trust of the masses who expect them to serve as role models or use their knowledge or expertise to render serves in the interest of the general public. One disgusting aspect of the issue is that some of those involved in this filthy game have the guts to say plainly that they serve dictators as marionettes in high positions so as to enrich their profiles. What a preposterous argument! Enriching their CVs to the detriment of the masses! Where is decency? What about integrity and sincerity? Are those opportunists oblivious to the importance of these virtues and the devastating effects of serving the interest of a dictator at the expense of public interest?  <br> <br>" +
                    "" +
                    "It should be borne in mind that dictators have no permanent friends or enemies but permanent interest. This being the case, they are always ready to bulldoze anybody they see as a threat to their existence or political interest, and never hesitate to weed out those who have outlived their usefulness to them, even their closest allies or associates. Hence, anybody can fall from grace to grass or vice versa at any time under a dictator. Those they treat as favourites and praise highly can be ejected all of a sudden and subjected to all sorts of brutalization or humiliation. By the same token, arch-enemies or arch-critics can be taken on board suddenly and treated as saints to the bewilderment of those who do not understand how dictators operate. Hence, it is not anomalous to see people being recycled in a dictatorship. A dictator can discard an ally or associate and level very serious allegations against him, only to take a u-turn and recall him when he desperately needs his services. Dictators also liquidate or eliminate those who run dirty errands or do dirty jobs for them and those who know about their dirty deals or misdeeds. They do this to efface traces of evidence. This is exemplified by the innumerable deaths and disappearances under mysterious circumstances characterizing dictatorships. <br> <br>" +
                    "" +
                    "Thus, those enjoying the favour of dictators and serving their interest should watch. There is no guarantee that they will not fall victim like their predecessors or fallen colleagues one day. It is also worth noting that those known for defending the interest of a dictator find it extremely hard to be accepted by members of society when they are dumped by the dictator, no matter how much they try to wash themselves or erase the stigma. They are viewed as insincere, disgruntled people or hypocrites when they bad-mouth or speak ill of their former boss whom they used to treat as a demigod or defend publicly. To expose those folks as disingenuous characters, some of their compatriots remind them of their past utterances and acts in favour of the dictator whenever they open their mouths or put pen to paper. This is particularly the case with self-proclaimed intellectuals who have, at one time, taken pains to defend or serve the interest of a dictator. This explains why most people choose to keep a very low profile after having been given the boot by a dictator whose interest they have defended blindly.   <br> <br>" +
                    "" +
                    "To those who advance arguments in favour of dictators, I respond thus: Dictators are neither intelligent nor wise. Their acts backfire sooner or later, leading to their downfall and disgrace. Dictators dig their own graves through their childish, irresponsible utterances and wicked, despicable acts. We are all living witnesses to the tragic, wretched and miserable end of powerful dictators. Dictatorship is tantamount to madness. How can one brutalize his compatriots for his selfish interest and expect comfortable life on earth and happy, dignified end? Brutalizing one’s compatriots for personal interest defies   intelligence and wisdom. Any dictator who believes he can brutalize his people continuously and get away with it is fooling himself. He is bound to perish the same way he makes people perish. As a man sows shall he reap! Dictators are not brave. Nor do they have supernatural or magical powers as they want to make people believe. They are mere mortals and big cowards! If they are brave or have supernatural powers, why do they need tight security or escort? Why do they kill people secretly and deny it? Why do they back down or flee for their lives when the going gets tough?  Their self-proclaimed bravery is grounded on the presence of guards. Simple logic! Without guards, they would not dare to oppress or offend people. This is evinced by the fact that those dictators who portray themselves as brave leaders were not known for bravery before they came to power. Dictators are insincere, unpatriotic citizens.  They are immeasurably greedy and selfish.  Even if they have succeeded in bringing some development as they and their defenders argue ardently, that does not give them licence to kill people or deny them freedom and liberty which are fundamental, god-given rights. No amount of development can be equated with human life, freedom and liberty. After all, the money spent to realize what they refer to as development comes from state coffers, not from the pockets of dictators. Besides, it is an open secret that dictators who claim to be development-oriented and patriotic plunder quite a lot of money which they squander or use to take care of their families. Thus, it can rightly be stated that their acts are geared more towards satisfying their insatiable desire for riches, catering for the needs of their families or defending their selfish political interest than developing their countries, even if some of the acts are beneficial to people in some cases. In summary, dictators care much more for themselves and their families than they care for their people and countries. Otherwise, why would they brutalize or kill people as a means of clinging onto power while endeavouring to provide security and high quality, luxurious life for themselves and their families? One who monstrously brutalizes or kills his compatriots to consolidate his power cannot rightly be qualified as a patriotic citizen. He is a sadist and a brute! Pure! It is sheer gullibility to believe the contrary. Dictators are not loved by their people, for human beings want freedom and liberty by their nature. The support dictators enjoy results from fear and opportunism, not from love. This is substantiated by the fact that people rejoice or jubilate massively, tearing the photos of dictators or pulling down their statues when they are ousted. Hence, it is crystal clear that dictators are a nuisance and a menace. Down with dictatorship! <br> Good riddance to dictators!  <\font>   <br> <br>"

                ,
            "<font color=\"black\"><b>The Downfall of Jammeh: Good Riddance To Bad Rubbish! </b> <br> <br>" +
                    "" +
                    "It goes without saying that many people have breathed a sigh of relief and rejoiced over Jammeh’s fall from grace to grass. This is not because people hate him as a person, but because they hate his bad manners as a brutal, blood-thirsty dictator. It is a pity that Jammeh was oblivious to this fact and hence regarded his critics, rivals and opponents as unpatriotic citizens and criminals who deserved death or severe punishment. He committed heinous crimes and unpardonable sins in his earnest but futile efforts to suppress dissent in order to perpetuate himself in power.  Consequently, he earned himself a lot of enemies and incurred the wrath of God. <br> <br>" +
                    "" +
                    "Now that the table has turned, one would expect Jammeh to humble himself or swallow his pride and apologize to his compatriots. Let me hasten to note that this is not the case. While announcing his decision to relinquish power, Jammeh behaved as if he doesn’t owe his numerous victims and their loved ones an apology.  Pompous and arrogant as he is, he pretended to be brave, telling us that he was stepping down of his own accord so as to avoid bloodshed. We all knew that he was preparing to flee The Gambia to save his life. He was scared to death. He realized that the ECOWAS meant business and that bullets would rain on him if he refused to give up power and leave The Gambia as dictated by the ECOWAS. This is the guy who claimed that he owned The Gambia. He is the very one who insulted the ECOWAS, posing them the rhetorical question “Who the hell are they to tell me to leave my country?” He has now gone into exile after sending many of his compatriots into exile. Good riddance to bad rubbish! What a coward! What an irony! Jammeh’s situation lends credence to the saying “What goes around comes around”. As he tastes his own medicine, I urge him to close his eyes and try to swallow the bitter pills of exile.     <br> <br>" +
                    "" +
                    "I guess Jammeh has regretted why he was born, just as he used to tell people mockingly and scornfully. I think he is now cognizant of the fact that no condition is permanent and that power belongs to the people as we used to tell him. Given the way and manner in which those who claimed to be his ardent admirers and loyalists ditched him after his election defeat, I also believe he has now come to the realization that love and loyalty cannot be bought or forced.  <br> <br>" +
                    "" +
                    "In this connection, I would like to reproduce some paragraphs from my article entitled Perpetuation of Dictators: What Factors Are Responsible?, which was published in December 2011 and 2015:  <br> <br>" +
                    "" +
                    "To those who advance arguments in favour of dictators, I respond thus: Dictators are neither intelligent nor wise. Their tactics and wicked deeds backfire sooner or later, leading to their downfall and disgrace. Dictators dig their own graves with their irrational, irresponsible utterances and cruel, despicable acts which provoke, agonize, antagonize and alienate people. We are all living witnesses to the tragic, wretched, miserable end of powerful dictators. Dictators are mentally retarded. How can one brutalize his compatriots for his selfish interest and expect comfortable life on earth and happy, dignified end? Brutalizing one’s compatriots for personal interest defies   intelligence and wisdom. Any dictator who thinks that he can brutalize his people continuously and go scot-free or get away with it is living in a fool’s paradise. He is bound to perish the same way he makes people perish. <br> <br>" +
                    "" +
                    "Dictators are not brave, nor do they have supernatural or magical powers as they want to make people believe. They are mere mortals and big cowards. If they are brave or have supernatural powers, why do they need tight security or escort? Why do they kill people secretly and deny it? Why do they back down or flee for their lives when the going gets tough?  They pretend to be brave because they are always surrounded by guards armed to the teeth. Simple logic! Without guards, they would not dare to oppress or offend people. This is evidenced by the fact that those dictators who portray themselves as brave leaders were not known for heroism or bravery before they came to power. They were not courageous enough to treat people with rudeness or disrespect as they do while in power. <br> <br>" +
                    "" +
                    "Dictators are insincere, unpatriotic citizens.  They are immeasurably greedy and selfish.  Even if they succeed in bringing development as they and their defenders and flatterers claim, that does not give them licence to kill people or deny them freedom and liberty which are fundamental, God-given rights. Development cannot be equated with human life, freedom and liberty. After all, the money spent to realize what they refer to as development comes from state coffers, not from their pockets. Besides, it is an open secret that dictators who claim to be patriotic and development-oriented steal astronomical sums of money which they spend lavishly on misplaced priorities. It can rightly be stated that the acts of dictators are geared more towards enriching themselves, catering for the needs of their families or defending their selfish political interest than developing their countries, even if some of the acts are beneficial to people in some cases. In summary, dictators care much more for themselves and their families than they care for their compatriots and countries. Otherwise, why would they brutalize or kill people as a means of clinging onto power while endeavouring to provide security, safety and comfort for themselves and their families and lead flamboyant lives? A leader who brutalizes or kills his compatriots to consolidate his power cannot rightly be called a patriotic citizen. Such a leader can only be qualified as a sadist, a monster or a brute. Pure! It is sheer credulity and gullibility to believe that such a leader has the interest of his country and people at heart. <br> <br>" +
                    " " +
                    "Dictators are not loved by their people, for human beings want freedom and liberty by their nature. The support dictators enjoy results mainly from opportunism and fear, not from love. This is substantiated by the fact that people rejoice and tear the photos of dictators or pull down their statues when they are ousted. That many supporters of dictators try to dissociate or distance themselves from them soon after their downfall further buttresses the point. The fact many people who defend dictators use pseudonyms or hide behind pennames shows clearly that they don’t love them or believe that they are patriots as they claim. These people are opportunists who just want to defend their interests by helping to keep such dictators in power, knowing very well that they are defending a wrong cause. That people who have been victimized or brutalized by dictators can publicly sing their praises amply demonstrates the fact that dictators are feared, not loved. No right-thinking person would interpret the praises of a victim as love for his victimizer. <br> <br>" +
                    "" +
                    "Dictators are tormentors and scourges. Therefore, they should be fought tooth and nail. Dictatorship is a form of slavery, and it is disheartening, disgraceful and shameful to be enslaved by one’s own compatriot. I urge all well-meaning, patriotic citizens to contribute their quota to the noble cause of combating dictatorship.  <br> <br>" +
                    "" +
                    "Now that the “mighty” Jammeh has fallen and left our dear motherland, I unreservedly commend all those who stood up against dictatorship in our beloved country overtly or covertly and pray to Allah the Omnipotent to shower His blessings on them and reward them abundantly. <br> <br>" +
                    "" +
                    "To conclude, I would like to welcome Jammeh’s former chief spin doctor Sheriff Samsudeen Sarr to our camp with open arms. That is the camp of those who detest dictatorship and embrace democracy; the camp of those who love peace and justice; the camp of those who recognize human dignity and respect human rights. I personally accept Sam’s apology as one of his co-debaters who received shots from him. I highly appreciate the fact that he has the courage and courtesy to apologize to the public. He is quite different from his former master in this respect. With the emergence of a new Gambia, I am confident that Sam Sarr will be accorded the opportunity to live freely in The Gambia and allowed to conduct his business and express his views unhindered as he wishes. That is the type of Gambia the members of our camp envisaged; a Gambia with just, righteous, tolerant, merciful, kind and compassionate leaders who do not deny people their rights; a Gambia where people can live with peace of mind and given their dues without having to behave as sycophants and praise-singers of their leader with a view to ingratiating themselves with him or gaining his favour; a Gambia which people residing abroad can visit without having to castigate or caricature perceived enemies, opponents and critics of the leader as a way of seeking his pleasure and recognition; a Gambia where people are treated fairly without bias or favouritism, regardless of faith, gender, tribe, ethnicity or social origin. <br> <br>" +
                    "" +
                    "As my brother Sam Sarr has done, I humbly ask for forgiveness from innocent Gambians who feel offended by my comments during the course of our crusade to uproot the dictator. <br> <br>" +
                    "" +
                    "Long live The Gambia! <br>" +
                    "God bless The Gambia!  </font> <br>"
            ,
            "<font color=\"black\"><b>Good and bad omens </b> <br> <br>" +
                    "The invitation extended to a cross section of the Gambian society, particularly members of the defunct PPP regime, to converge at State House to discuss the state of affairs of the country and the comments made by Omar Jallow (OJ), former PPP minister regarding the admission of The Gambia to the Africa Growth and Opportunity Act (Ogoa) by the US government are omens of bright political future for the country. <br> <br>" +
                    "" +
                    "As The Independent felicitously editorialised on Friday, June 10, 2003, all Gambians have a stake in the running of the country. Therefore, we should learn to sit together as brothers and sisters to discuss issues affecting The Gambia as a nation, irrespective of political affiliation and other minor differences. Every Gambian who is willing   should be accorded the opportunity to contribute his/her quota to the smooth running of the country, as every Gambian is duty-bound to work for peace and stability of The Gambia. Besides, two heads are better than one, and inviting the opinion of the public increases chances of success. Moreover, one can always make positive contribution in one way or the other if he/she so wishes, regardless of the errors he/she has committed or perceived to have committed in the remote or recent past. It goes without saying that inviting old politicians like Kama Badjie, MC Cham and Lamin Kiti Jabang can yield good results in the domains of reconciliation, national unity and nation building. Thus, I hastily join The Independent and the Daily Observer in hailing this noble, meritorious gesture in their editorials of June 10, 2003 and June 13, 2003, respectively. I also laud the invitees for accepting the invitation, which amply manifests their willingness to contribute. <br> <br>" +
                    "" +
                    "Undoubtedly, The Gambia stands to benefit from its acceptance to Agoa. Hence, the fact that OJ welcomes the development as reported by Omar Bah and Alieu Badara Ceesay in the Daily Observer issue of June 10, 2003, is a sign of responsible opposition. This demonstrates a very high sense of patriotism and political maturity on the part of OJ. Like the reporters, I qualify it as a bold step. I endorse the deed and commend OJ unreservedly. Many African opposition politicians should borrow a leaf from OJ’s book. True, opposition politicians are watchdogs. However, their role should not be narrowed down to fault finding or launching vituperative attacks on their rivals. In other words, they should not portray themselves as captious or scurrilous people, or career critics, as some Gambian journalists would put it. <br> <br>" +
                    "" +
                    "Turning the other side of the coin, one can say that the death threats issued to the editors of The Independent as reported in its January 13, 2003 edition, is an omen of gloomy future for the Gambian press. <br> <br>" +
                    "" +
                    "At a time when media practitioners and other concerned Gambians and non-Gambians are heaping opprobrium on the Gambia government over the Media Commission Bill which they see as an attempt to gag the Gambian press, it is monumentally disheartening to receive such a shocking piece of news in a country renowned for peace. Such threats are utterly alien to our society! Whether the threats are meant to be carried out or are merely geared towards scaring the editors into changing their stance, they should not be taken lightly. Earnest efforts should be made to track down those monsters and guarantee the security of their targets. I exhort the police and the NIA to redouble their efforts in this regard, though their co-operation  thus far is highly commendable. The co-operation of the general public is also requested. We cannot afford to allow such a filthy, obnoxious and deplorable behaviour to prevail in our society. I urge those scoundrels to put up their thinking caps. Only a fool would boast of having the power to take the lives of people and get away with it as the reprobates claimed. Only a clod would allow himself to be used by others like a marionette to kill or intimidate innocent people doing their job, as they shamelessly bragged. What a dirty job! A decent, wise person takes pride in improving the lives of his compatriots or contributing to the enhancement of the well-being of mankind in general. If those miscreants have nothing good to offer to humanity, which seems to be the case, they better leave people alone rather than trying to impede their work. Whether they have the power they claimed or are backed by so-called powerful people or not, I would like to remind them that it is only God who has true, eternal power. Do they know what is going to happen to them in the next few days? Certainly not! Do they or those they claim to be backing them have the power to resist death when the time comes? Not at all! What power do they have then? The power to intimidate, bully or kill? If so, my response is that the power to resist death, which they certainly lack, is more beneficial that the power to torment or kill. In fact, they are cowards, as Abdoulie Sey rightly said. Even a small child can insult others or threaten them with death while in hiding. If those rogues are really powerful and brave, they should come out and issue such threats and see. If they hate The Independent and want to see its demise, I would like to put it to them that so many people love the paper and thus want to see it flourish and continue to exist. If they feel that they or their backers are offended by The Independent for no just cause, the problem is easy to resolve. Let them counter the words of The Independent with words or take legal action against the company rather than resorting to violence. <br> <br>" +
                    "" +
                    "My dear compatriots, let us join hands and work for the betterment of our beloved country. Let us accept each other as Gambians with equal rights and equal stake in the running of the country, putting aside arrogance, intolerance, bigotry and aggression. Unless we comport ourselves in such a manner, we will find it difficult to attain meaningful development and enjoy durable peace. <br> <br>" +
                    "" +
                    "Long live The Gambia! Amen. </font> <br> "
            ,
            "<font color=\"black\"><b>Have You Forgotten? </b> <br> <br>" +
                    "" +
                    "You have said so much and a lot of water has passed under the bridge since you came to power as a putschist, <br>" +
                    "For which reasons observers describe you as irritable, cantankerous, querulous, controversial, negligent, nonchalant, mercurial and eccentric " +
                    "I therefore deem it fitting to address this note to you, <br>" +
                    "Hoping that it will serve you as a reminder, <br>" +
                    "In case you have forgotten, <br>" +
                    "Due to your tight schedule, laborious tasks and burdensome preoccupations, <br>" +
                    "Notwithstanding the notion harboured by those you have hypnotized and brainwashed,  <br>" +
                    "That you are infallible, impeccable and all-knowing, equipped with a capacious memory <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You complained upon mounting power that your predecessor overstayed in power, <br>" +
                    "Contending that even 10 years in power is too long a time, <br>" +
                    "Vowing that no one would be allowed to stay in power in your country for more than 10 years from then <br>" +
                    "But you blatantly and doggedly refuse to have presidential term-limit enshrined in the constitution of your country, <br>" +
                    " Saying plainly and publicly that neither election nor coup d’état will remove you from power, <br>" +
                    "And that those vying to succeed you should wait patiently like a vulture for 400 years <br>" +
                    "These are conflicting statements and deeds <br>" +
                    "How can you reconcile them? <br>" +
                    "I treat the last statement as a hyperbolic one <br>" +
                    "But I would like to state without hesitation, <br>" +
                    "That there is every indication that you are obstinately determined to overstay your welcome and perpetuate yourself in power at all cost <br>" +
                    "You try to give the impression that you are indispensable,  <br>" +
                    "Pretending to be the only patriotic citizen of your country, <br>" +
                    "And stifle dissent using all means you consider necessary, <br>" +
                    "Regardless of the repercussions     <br>" +
                    "Are you a special breed? <br>" +
                    "What makes you cherish the illusion that you are the only one capable of leading your country?  <br>" +
                    "Did you achieve anything extraordinary before you came to power that none of your compatriots ever achieved? <br>" +
                    "What supports your pretence that you are the only patriotic citizen of your country? <br>" +
                    "Did you do anything good for your country before coming to power that no other citizen did? <br>" +
                    "Why are you too hostile to your opponents and always eager to victimize or even liquidate them?   <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You set up Commissions of Enquiry to investigate your predecessor and members of his regime, <br>" +
                    "Saying that you wanted to recover all the money and properties you claimed they stole while in office, <br>" +
                    "And promised that you would present the money and properties recovered to your compatriots at the end of the exercise and ask them how they wanted the “loot” to be used<br>" +
                    "But we haven’t heard anything on the matter from you since then <br>" +
                    "A prominent, popular and vocal minister of the former regime has on several occasions challenged you to publish the report of the commissions for the world to judge, <br>" +
                    "But you still remain mute <br>" +
                    "What is the matter? <br>" +
                    "Is it that you haven’t recovered anything? <br>" +
                    "Is it that you have re-looted the loot? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You attempted to befriend the press during the early days of the coup, <br>" +
                    "Saying that journalists were free to criticize you where you went wrong <br>" +
                    "But your marriage with the press was ephemeral <br>" +
                    "You instantaneously waged a war against journalists, <br>" +
                    "Lampooning them by calling them “illegitimate sons of Africa”, <br>" +
                    "Threatening to bury them six feet deep if they offend you <br>" +
                    "What has changed to warrant such a negative attitude towards the press? <br>" +
                    "Is it that you never go wrong? <br>" +
                    "Is it that you have something to hide? <br>" +
                    "Why this press-phobia if you have no skeletons in your cupboard? <br>" +
                    "Now that you have caused unprecedented damage to your country and tormented your people, would you say that you are a more legitimate son of Africa than journalists?  <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You promised a thorough investigation after the gruesome, lugubrious murder of a minister who was serving in your government  <br>" +
                    "Reports have it that you shed tears during your visit of condolence to the bereaved family, <br>" +
                    "Claiming that the deceased was a personal friend of yours <br>" +
                    "But we are yet to hear from you on the progress of the “investigation”, <br>" +
                    "And thus grow more and more suspicious of your implication or involvement in this heinous, monstrous crime <br>" +
                    "Have you really ordered an investigation as promised? <br>" +
                    "If so, why allow the case file to gather dust in the drawers of the investigating-authorities for about a decade and a half? <br>" +
                    "Were your tears genuine? <br>" +
                    " Were they crocodile ones as alleged by many? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You promised to electrify the whole of your country- even the rural areas, <br>" +
                    "Claiming that power outrage would soon be a thing-of-the-past, <br>" +
                    "After sprinkling “spiritual” liquid on newly-acquired generators <br>" +
                    "But we haven’t yet had adequate electricity supply in the urban areas, <br>" +
                    " Talk less of rural electrification which we now believe will only come as a miracle <br>" +
                    "What is wrong? <br>" +
                    "Have your demons or jinn failed you? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You announced the discovery of oil in your country long ago, <br>" +
                    "Brandishing a CD which you claimed contained information to that effect on your national TV, <br>" +
                    "Promising to commence drilling the oil immediately and use its proceeds to transform your country from a begging-nation to a major-donor one <br>" +
                    "But the noise of the oil discovery subsided soon after it started <br>" +
                    "How far have you gone with the exploitation of the oil?  <br>" +
                    "Have the oil wells dried up? <br>" +
                    "An ex-ally of yours has told us that you didn’t even know how to operate a computer at the time of brandishing the CD, <br>" +
                    " And that he had learned from your petroleum engineers that in fact the CD was empty <br>" +
                    "True or false, a shrewd leader who is computer literate would ask experts to give a PowerPoint presentation for the sake of transparency, <br>" +
                    "Rather than just showing people a CD on the TV screen without allowing them to see its contents <br>" +
                    "Why were you in a hurry to make the announcement without ascertaining the facts? <br>" +
                    "Was that a political gimmick as usual? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You promised to build a state-of-the-art railway linking the capital of your country to the most distant town, <br>" +
                    "And provide high-speed trains to transport people and goods <br>" +
                    "But nothing has been said on this “project” since then <br>" +
                    "Are you still engaged in feasibility studies? <br>" +
                    "I am privy to the information that the leader of a landlocked country approached you, <br>" +
                    "With the intention of embarking on a railway project, <br>" +
                    "To facilitate the transportation of goods to his country by using the ports   of your country, <br>" +
                    "As evidenced by the presence of that leader and his predecessor as high-profile guests during one of the lavish anniversary celebrations of your putsch, <br>" +
                    "Despite the fact that the later was occupying a very high position at the African Union at the time and was a renowned democrat,  <br>" +
                    "Leading observers to wonder how he could participate in the celebration of a coup <br>" +
                    "But you pretended to be the originator of the project for political gains" +
                    "Would you help clarify matters? <br>" +
                    "Why this long silence? <br>" +
                    "Is it that the authorities of that landlocked country have decided to abandon their plan? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You made a promise to turn your country to an economic super power during the celebrations marking your victory in the last presidential election, <br>" +
                    "Saying that you gave a three-year notice period to countries like Dubai and the United Arab Emirates, <br>" +
                    "Asserting that your country would surpass them and no one would talk about them in terms of development any longer, <br>" +
                    "And that all the talk would be about the rapid, considerable development of your country <br>" +
                    "But you recently said while addressing youths that you intended to develop your country to the maximum but lacked the means to do so, <br>" +
                    "And that you fervidly wished you could <br>" +
                    "Point of observation! <br>" +
                    "Dubai is not a country- not even the capital of a country, <br>" +
                    "But the name of an emirate and a city in the United Arab Emirates <br>" +
                    "Coming back to your statements, I would say that they are irreconcilable <br>" +
                    "Have you now realized that you cannot transform your country into an economic super power and develop it more that the United Arab Emirates or Dubai Emirate/City in three years? <br>" +
                    "What was the basis of your promise? <br> <br>" +
                    "" +
                    "Have you forgotten? <br>" +
                    "You promised your compatriots hell-on-earth on the eve of your inauguration after the presidential election, <br>" +
                    " Telling them that they would see a different type of a leader in you, <br>" +
                    "As there would be no more mercy or compromise, <br>" +
                    " But harshness and toughness, <br>" +
                    "And later threatened to execute death row inmates <br>" +
                    "Incredible but true! <br>" +
                    "These promises have been speedily fulfilled to the letter <br>" +
                    "Many people have been fired, arrested, detained, jailed or fined hefty amounts of money since  <br>" +
                    "Death row inmates have been executed, <br>" +
                    "And media houses have been closed <br>" +
                    "Why have you failed to honour the good promises you have made but wasted no time to carry out the negative ones? <br>" +
                    "Are you better at marring than making? <br>" +
                    "Are you better at destroying than building, put in simple terms? <br>" +
                    "Don’t you think fulfilling negative promises while failing to honour good ones undermines your credibility as a self-proclaimed patriot? <br>" +
                    "Don’t you think your behaviour has nullifying effects on your reputation? </font> <br>"
            ,
            "<font color=\"black\"><b>Too Many Unfulfilled Promises: How Can We Trust You?</b><br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You have made too many unfulfilled promises since you came to power through a putsch two decades ago,<br>" +
                    "Despite your claim to be honest and sincere,<br>" +
                    "For which reason observers describe you as untrustworthy,<br>" +
                    "And suggest treating all your pronouncements with caution to avoid disappointment<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You complained upon assuming office that your predecessor overstayed in power,<br>" +
                    "Contending that even 10 years in power is too long a time,<br>" +
                    "Vowing that no one would be allowed to stay in power in our country for more than 10 years from then<br>" +
                    "But you blatantly and doggedly refuse to have presidential term-limit enshrined in the constitution of your country as recommended by the Consultative Committee you set up to look into matters pertaining to the transition from military to civilian rule,<br>" +
                    "Saying repeatedly, plainly and publicly that neither election nor coup d’état will remove you from power,<br>" +
                    "And that those vying to succeed you should wait patiently like a vulture for 400 years,<br>" +
                    "Giving the impression of invulnerability and invincibility<br>" +
                    "You however lack the courage to organize free and fair elections and flatly reject the idea of providing a level playing field for elections as demanded by the opposition and recommended by the international community,<br>" +
                    "And insist on illegally maintaining in office the current chairman of the “IEC”,<br>" +
                    "Allegedly with the aim of using him to help you to steal victory or rig elections,<br>" +
                    "In spite of the thunderous, reverberating clamours of the opposition<br>" +
                    "You keep tightening your security by accumulating heavy, dangerous weapons,<br>" +
                    "Buying the loyalty of gullible members of the armed and security forces by granting them short-term privileges,<br>" +
                    "Eliminating those among them you perceive to be a threat to your security and existence as a leader by executing them or sentencing them to life imprisonment,<br>" +
                    "And pitting them against each other by ordering them to arrest, detain, torture or butcher each other,<br>" +
                    "With the aim of avoiding coup d’état<br>" +
                    "You call yourself Dictator for Development in your attempt to fool your compatriots,<br>" +
                    "Claiming that democracy is an illusion,<br>" +
                    "Accusing Western democratic countries of extreme racism and xenophobia<br>" +
                    "But you have ironically bought a mansion at an exorbitant price in a Western democratic country,<br>" +
                    "And always send your family members there for the purpose of medical treatment, extravagant visits and education,<br>" +
                    "In addition to doing your utmost best to secure citizenship for them in that country without avail,<br>" +
                    "And hire lobbyists from the same country with colossal sums of money<br>" +
                    "You try to give the impression that you are indispensable,<br>" +
                    "Pretending to be the only patriotic citizen of your country,<br>" +
                    "And stifle dissent using all means you consider necessary,<br>" +
                    "Regardless of the ramifications<br>" +
                    "Your statements and deeds are in sharp contrast<br>" +
                    "They have amply proven your selfishness, greed, grudge and malice<br>" +
                    "I treat your statement of intent as a hyperbolic one,<br>" +
                    "Because you are mortal and cannot live on earth for 400 years<br>" +
                    "But I would like to state without hesitation,<br>" +
                    "That there is every indication that you are obstinately determined to overstay your welcome and perpetuate yourself in power at all cost<br>" +
                    "Do you think you can fool us with your bluffs and make us believe credulously that you fear neither ballot nor bullet in spite of your apparent reluctance to play by the electoral rules and your numerous precautionary security measures?<br>" +
                    "If you really believe that democracy is not an ideal system of government and that Western democratic counties are too racist and xenophobic as you portray them, how come you trust such countries to the extent of purchasing an expensive property there, allowing your loved ones to reside and receive education there, and employing their citizens as lobbyists with exceedingly-hefty salaries?<br>" +
                    "What makes you cherish the illusion that you are the only one capable of leading your country?<br>" +
                    "Are you a special breed?<br>" +
                    "Did you achieve anything extraordinary before you came to power that none of your compatriots ever achieved?<br>" +
                    "What supports your pretence that you are the only patriotic citizen of your country?<br>" +
                    "Did you do anything good for your country before coming to power that no other citizen ever did?<br>" +
                    "Why are you too hostile to your opponents and always eager to victimize or eliminate them?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You adopted the catchphrase “transparency, accountability and probity”,<br>" +
                    "Chanting the slogan loudly and monotonously at every opportune moment,<br>" +
                    "And later set up Commissions of Enquiry to investigate your predecessor and members of his regime,<br>" +
                    "Saying that you wanted to recover all the money and properties you claimed they stole while in office,<br>" +
                    "And promised to present the money and properties recovered to your compatriots at the end of the exercise and ask them how they wanted the “loot” to be used<br>" +
                    "But we haven’t heard anything on the matter from you since then<br>" +
                    "A prominent, popular, vocal and brave minister of the former regime has on several occasions challenged you to publish the report of the commissions for the world to judge but you remain mute<br>" +
                    "You told us that you didn’t seize power to enrich yourself,<br>" +
                    "But later boasted of your riches saying publicly that your great-grandchildren will never be poor<br>" +
                    "Why haven’t you published the report for the sake of transparency, accountability and probity?<br>" +
                    "Is it that you haven’t recovered anything?<br>" +
                    "Is it that you have re-looted the loot?<br>" +
                    "Is it that you haven’t found anything implicating or incriminating?<br>" +
                    "Was the setting up of the Commissions of Enquiry not a mere pretext to justify your coup or enviously and begrudgingly witch hunt members of the former regime as observers have cogently and convincingly argued?<br>" +
                    "Given the fact that you were as poor as a church mouse when you came to power and that you now behave as if you are richer than the state which you have overshadowed, do you consider it morally justifiable to punish members of the former regime or anyone else for corruption or embezzlement?<br>" +
                    "Why have you abandoned your motto “transparency, accountability and probity”?<br>" +
                    "How can you reconcile your claim of not aspiring to be rich and your brag of having amassed enough wealth to cater for the needs of your great-grandchildren?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You unreservedly condemned sycophancy, praise-singing and flamboyant lifestyle at the beginning of your reign,<br>" +
                    "Claiming that they characterized society and government when your predecessor was in power,<br>" +
                    "Expressing your resolve and determination to bring “sanity”<br>" +
                    "You thus summoned, assembled, castigated and shamed griots whose only “crime” was playing their socio-cultural roles,<br>" +
                    "Only to turn round and surround yourself with sycophants, flatterers and spin doctors who eulogize, aggrandize, glorify and mystify you- including the one you have angrily called a compulsive, pathological liar on your TV and described his widely-read book as a pack of lies meant to soil your image and defame you,<br>" +
                    "And cultivate the habit of dishing out huge sums of money to musicians, filmmakers and writers who sing your praises and help you in your propaganda<br>" +
                    "You frequently organize lavish festivals and ceremonies,<br>" +
                    "Besides buying extremely-costly vehicles<br>" +
                    "If you are confident and sincere as you want to make us believe, why do you need the services of sycophants, spin doctors and praise-singers?<br>" +
                    "If you are compassionate and patriotic as you project yourself, why do you plunder and squander the meagre, direly-needed resources of the people you claimed you came to liberate and salvage?<br>" +
                    "Why have you adopted the very profligate, ostentatious lifestyle you denounced earlier?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You promised a thorough investigation after the gruesome, brutal murder of a minister who was serving in your government<br>" +
                    "Reports have it that you shed tears during your visit of condolence to the bereaved family,<br>" +
                    "Claiming that the deceased was a friend of yours<br>" +
                    "But we are yet to hear from you on the progress of the “investigation”,<br>" +
                    "And hence grow more and more impatient and suspicious of your implication and involvement in that horrendous murder<br>" +
                    "When are you going to shed light on that atrocious crime?<br>" +
                    "Have you really ordered an investigation to get to the bottom of the matter as promised?<br>" +
                    "If so, why allow the case file to gather dust in the drawers of the investigators?<br>" +
                    "If not, why have you chosen to let sleeping dogs lie?<br>" +
                    "How can you convince us that you have clear conscience about that heinous crime with your silence on the issue?<br>" +
                    "Were your tears genuine?<br>" +
                    "Weren’t they crocodile ones as alleged by many?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You attempted to befriend the press during the early days of your coup,<br>" +
                    "Promising to co-operate fully with members of the press,<br>" +
                    "Saying that journalists were free to criticize you where you went wrong<br>" +
                    "But your marriage with the press was short-lived<br>" +
                    "You hot-headedly waged a war against journalists,<br>" +
                    "Threatening to bury them six feet deep if they offend you,<br>" +
                    "And soon started persecuting them,<br>" +
                    "Lampooning them by calling them the “illegitimate sons of Africa”<br>" +
                    "Why this press-phobia and antagonistic attitude towards journalists?<br>" +
                    "Is it that you have something to hide?<br>" +
                    "Is it that you never go wrong?<br>" +
                    "Now that you have proven to be a nuisance, a menace and a disgrace to Africa by causing enormous damage, affliction and torment, do you maintain that journalists are the illegitimate sons of Africa?<br>" +
                    "If so, what sort of African son do you consider yourself to be?<br>" +
                    "Do you still believe that journalists are more undesirable elements than you are as you erroneously believed?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You made an undertaking to electrify the whole of our country- even the rural areas,<br>" +
                    "Claiming that power outrage would soon be a thing-of-the-past,<br>" +
                    "After sprinkling “spiritual” liquid on newly-acquired generators<br>" +
                    "But we haven’t yet had adequate electricity supply in the urban areas,<br>" +
                    "Talk less of rural electrification which we now believe will only come as a miracle<br>" +
                    "What is wrong?<br>" +
                    "Are you not willing to fix the electricity problem?<br>" +
                    "Do you lack the ability?<br>" +
                    "Have your demons or jinn betrayed you?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You announced the “discovery” of oil in your country long ago,<br>" +
                    "Brandishing a CD which you claimed contained information to that effect on your TV,<br>" +
                    "Promising to commence drilling the oil immediately and use its proceeds to transform our country from a begging-nation to a major-donor one<br>" +
                    "But the noise of the supposed oil discovery has subsided since<br>" +
                    "If you have started exploiting oil, how far have you gone?<br>" +
                    "How do you utilize the proceeds?<br>" +
                    "Why were you in a hurry to make the announcement of the “discovery”?<br>" +
                    "Was that a political gimmick?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You gave a pledge to build a state-of-the-art railway linking the capital of our country to the most distant town,<br>" +
                    "And provide high-speed trains to transport people and goods<br>" +
                    "But nothing has been said on the project since then<br>" +
                    "I am privy to the information that the leader of a landlocked country approached you with the intention of embarking on a railway project to facilitate the transportation of goods to his country using our ports,<br>" +
                    "As evidenced by the presence of that leader and his predecessor as high-profile guests during one of the anniversary celebrations of your coup,<br>" +
                    "Despite the fact that the latter was occupying a very high position at the African Union at the time and was a renowned, reputable democrat unlike you,<br>" +
                    "Leading observers to wonder why he accepted your invitation to grace the occasion<br>" +
                    "But you- for political gain- pretended to be the originator of the project<br>" +
                    "Are you still engaged in feasibility studies?<br>" +
                    "Would you help clarify matters?<br>" +
                    "Why this long silence?<br>" +
                    "Have the authorities of that landlocked country decided to cancel their plan?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You made a promise to transform your country into an economic superpower during the celebrations marking your victory in the last presidential election,<br>" +
                    "Saying that you gave a three-year notice period to countries like Dubai and the United Arab Emirates,<br>" +
                    "Asserting that our country would outstrip or overtake them and no one would talk about them in terms of development any longer,<br>" +
                    "And that all the talk would be about the rapid, considerable development of our country<br>" +
                    "But you later said while addressing youths that you intended to develop our country to the maximum but lacked the means to do so,<br>" +
                    "And that you fervidly wished you could<br>" +
                    "Point of observation!<br>" +
                    "Dubai is not a country- not even the capital of a country- but the name of an emirate, and a city in the United Arab Emirates<br>" +
                    "Coming back to your lofty “goals”, I would say that it may be good to aim high but imprudent, unwise or foolhardy to make empty promises, build castles in the air or set unachievable goals<br>" +
                    "Have you now realized that you cannot transform our country into an economic superpower and develop it to surpass the United Arab Emirates or Dubai Emirate/City in three years?<br>" +
                    "What was the basis of your promise?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You vowed to combat and curb drug peddling and consumption following the discovery of tons of hard drugs in our country<br>" +
                    "But you later instructed your rubberstamp National Assembly to decline the offer made by a foreign country to partner with our country to combat drug trafficking in its waters<br>" +
                    "The puppets among the members of the National Assembly obeyed blindly as usual,<br>" +
                    "Claiming that the proposed bilateral agreement did not favour our country,<br>" +
                    "Despite the alarmingly-high number of drug related cases reported in our country in recent years,<br>" +
                    "Pretending that they acted independently in the best interest of their country and people by rejecting the draft bilateral agreement<br>" +
                    "Your behaviour has led many people to believe that you have ulterior motive<br>" +
                    "I am not the least convinced that those members of the National Assembly acted freely or independently in the interest of their country and people as they wanted to fool us into believing<br>" +
                    "They feel that they owe you an obligation as their master and thus care more about your interest than that of the electorate<br>" +
                    "This is evidenced by their eagerness to ratify controversial bills or agreements that clearly seek to defend your personal interest or guarantee your security to the disadvantage of the populace<br>" +
                    "Chief among them is the bill granting blanket amnesty and immunity to the cruel killers of innocent, unarmed children in April 2000,<br>" +
                    "The bilateral agreement written in Spanish which was sent to the National Assembly   for ratification unaccompanied by an English translation,<br>" +
                    "And the Information and Communication Act which was amended with the ultimate goal of entrenching and perpetuating you in power by intimidating and neutralizing your critics and opponents<br>" +
                    "Some members of the opposition at the National Assembly voiced their concern in all cases and cautioned their colleagues but to no avail<br>" +
                    "Do you have an axe to grind vis-à-vis the foreign policy of the country that offered to work with our country in the crusade against drug trafficking?<br>" +
                    "Why didn’t you seize the opportunity accorded to you if you truly want to see our country free of drugs as you claimed previously?<br>" +
                    "Why didn’t you accept the proposed partnership in the war on drugs if you don’t have vested interest in the drug business?<br>" +
                    "How can you debunk or dismiss the widespread allegation that you are involved in drug trafficking after turning down the offer?<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "You announced a food security agenda referred to as Vision 2016,<br>" +
                    "Promising us food self-sufficiency by 2016,<br>" +
                    "Claiming that consumption of imported food is the main cause of the health problems of your compatriots,<br>" +
                    "Urging us to grow what we eat and eat what we grow,<br>" +
                    "Saying that you would ban importation of rice by December 2015<br>" +
                    "Your sycophants praised you for the move as usual,<br>" +
                    "Describing the so-called vision as bold, commendable and achievable,<br>" +
                    "Pledging their support to ensure its actualization<br>" +
                    "I observed at the time that the idea of making our country self-sufficient in terms of food is a good one,<br>" +
                    "But cast doubt on its feasibility and tenability,<br>" +
                    "Based on the timeframe of the vision and your tendency to fail promises as evidenced by the aforementioned ones<br>" +
                    "I also asked whether you really believed that your lofty goal was attainable,<br>" +
                    "And whether Vision 2016 was not another campaign promise<br>" +
                    "However, you announced your decision to extend the deadline when it was about to expire,<br>" +
                    "As you realized that the vision was unrealistic and unrealizable<br>" +
                    "Your blind loyalists applauded the idea of extending the deadline,<br>" +
                    "And renewed their promise to support you<br>" +
                    "Your sceptics were not surprised,<br>" +
                    "As they didn’t believe you in the first place<br>" +
                    "<br>" +
                    "How can we trust you?<br>" +
                    "It beats my imagination that you and your sycophants have the guts to call your opponents and perceived enemies liars,<br>" +
                    "And that you continue to treat us as big fools by bombarding us with pleasant promises,<br>" +
                    "Despite your failure to honour your innumerable promises<br>" +
                    "I therefore put it to you that the world now knows very well who the real liars are,<br>" +
                    "That we are not all credulous and gullible to be carried away or swayed by empty promises,<br>" +
                    "That we are not interested in your promises,<br>" +
                    "And that we yearn for your downfall<br>" +
                    "May you vanish before the end of 2016! Amen!</font><br>"
            ,
            "<font color=\"black\"><b>Human being or Monster?</b><br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "We heard you say “Let me make it very clear to you. I am not a monster. I am a human being”,<br>" +
                    "As if you were asked whether you are a monster or a human being<br>" +
                    "A sage has said that answering a question that is not asked raises eyebrows<br>" +
                    "Your unsolicited clarification is interpreted as guilty conscience by observers<br>" +
                    "It has aroused suspicion in many quarters,<br>" +
                    "Rather than exculpating or exonerating you as intended<br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "You flatly refuse to investigate heinous crimes suspected to be state sponsored,<br>" +
                    "And fume and rage whenever you are reminded of your responsibility to do so,<br>" +
                    "Threatening and castigating those who have the guts to reprimand you for your failure to do what is expected of you as the leader of your country<br>" +
                    "Is this behaviour human or monstrous?<br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "You granted blanket amnesty to those who mercilessly massacred children in April 2000,<br>" +
                    "And indemnified the culprits after it was established that the victims had been gunned down with live bullets,<br>" +
                    "Despite the public outcry and calls to bring the perpetrators of the gruesome murder to book<br>" +
                    "Adding insult to injury,<br>" +
                    "Fuelling fury, resentment and embitterment<br>" +
                    "Is this behaviour human or monstrous?<br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "You remorselessly and callously crush children with speeding vehicles in your convoy,<br>" +
                    "By throwing biscuits on the road for them to pick,  <br>" +
                    "As though they are hungry animals,<br>" +
                    "Ignoring condemnations of such barbarity,<br>" +
                    "Leading people to believe that you do it deliberately as human sacrifice<br>" +
                    "Is this behaviour human or monstrous? <br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "You hired fetishists to fish out people you termed as witches and wizards<br>" +
                    "They brutalized innocent women and men by forcing them to drink poisonous, hallucinating concoctions,<br>" +
                    "With many of them suffering serious health complications,<br>" +
                    "And some dying in severe pain,<br>" +
                    "Resulting in deep embarrassment and grieve<br>" +
                    "Is this behaviour human or monstrous?<br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "Many people have disappeared without trace under your watch after their arrest and detention by your security agents<br>" +
                    "Their loved ones have searched everywhere to no avail<br>" +
                    "Human rights defenders have voiced their concern without reaction from you<br>" +
                    "The press has reported the enforced disappearances on several occasions but you fail to take desired action and remain silent<br>" +
                    "You blatantly refuse to pronounce or shed light on such cases of disappearance as solicited by the aggrieved people, <br>" +
                    "Believing erroneously that the cases will die as time goes on<br>" +
                    "Is this behaviour human or monstrous?<br>" +
                    "<br>" +
                    "Human being or monster?<br>" +
                    "Your reign is marked by gross human rights violations<br>" +
                    " Your poor human rights record eclipses the so-called development projects which your spin doctors use to glorify you,<br>" +
                    "As a way of mending your battered image<br>" +
                    "No book or film produced by your publicists can fool people into believing that you respect human rights or have the interest of your country at heart<br>" +
                    "That is an elusive, unattainable goal,<br>" +
                    "And anyone who tries to do so will end up eroding his dignity or soiling his own image in the process<br>" +
                    "Human life should not be traded for development of any sort,<br>" +
                    "As the former is more important than the latter,<br>" +
                    "And the latter is meaningless where the former is not valued<br>" +
                    "In fact, the great bulk of the money used in your development projects comes as grants from benevolent countries which you shamelessly, senselessly and monotonously censure,<br>" +
                    " Or heavy loans to be repaid by taxpayers,<br>" +
                    "Therefore, your compatriots are not beholden to you for your development projects,<br>" +
                    "With all the atrocities committed during your reign of trauma and terror<br>" +
                    "It is your behaviour that tells people whether you are a human being or a monster,<br>" +
                    "Not your words of consolation,<br>" +
                    "For anybody can claim to be anything<br>" +
                    "People judge you by your acts,<br>" +
                    "Not by your utterances which are mostly in stark contrast with your deeds</font><br>"
            ,
            "<font color=\"black\"><b>The Ivorian crisis: What factors are responsible?</b><br><br>" +
                    "It goes without saying that the situation in Ivory Coast is alarming. The French negotiated peace deal is on the verge of collapsing, which is a cause for serious concern. The long awaited speech of President Gbagbo has done very little, if at all anything, to allay fears, as it has been condemned by the main actors, the members of Alassanne Ouattara’s party and the main rebel group who control the Northern part of the country, as a declaration of war.<br>" +
                    "<br>" +
                    "Although Gbagbo claims to have accepted the deal which, he himself earlier referred to as a mere ‘proposal’, his stance regarding the issue of nationality ‘ivoireté’ and the inclusion of rebels in the proposed government of national unity to be headed by Seydou Diarra, a northern Muslim renowned for neutrality and patriotism, leaves much to be desired. Besides, the open rejection of the deal and scathing condemnation of the French by the Ivorian First Lady on Radio France Internationale (RFI) two days before her husband’s speech does not tell well about the couple. According to President Gbagbo, the question of nationality, which is widely seen as an attempt to exclude the popular northern opposition leader, Alassanne Ouattara from the presidential race, will be put to a referendum. Given the fact that many northerners who support Ouattara have been disfranchised by newly promulgated laws and that people from the rest of the country where Gbagbo has his support base form the majority of Ivorians with voting rights, it can be easily and rightly concluded that the proposed referendum will only serve Gbagbo’s political interest to the detriment of that of Ouattara if conducted. Simply put, the latter will certainly continue to be barred from contesting in presidential elections, which is grossly unfair. <br>" +
                    "<br>" +
                    "The main rebel group claims that their reason for taking arms is grounded in the need to address the nationality issue which they see as oppression and injustice inflicted on the northerners. After the negotiations in France, the rebels claimed that they had been promised the portfolios of defence and interior in the proposed government- a claim which none of the negotiators has denied, for which reason it seems to hold water.<br>" +
                    "<br>" +
                    "Hence, Gbagbo’s lack of commitment to address these issues (nationality and inclusion of rebels in the proposed government) which many see as the key ones in the deal, has shattered hopes for peace. To many, his speech is just a specious talk crafted to hoodwink Ivorians and the international community. Whether or not the rebels are fighting for justice as they claim, they have a point, for no one wants to be segregated in his own country. Without addressing the nationality issue which has robbed many northerners of their rights as citizens, as planned by the Ivorian government, it would be extremely difficult, or even impossible, to bring peace to Ivory Coast. For me, any peace deal that fails to address this thorny issue will prove futile. It will just be like plastering the cracks on a wall rather than repairing the wall, as the giant writer, Uncle Salieu John would put it. To support my claim, I would like to remind you that all previously formed governments of national unity in Ivory Coast failed while the crisis keep snowballing. Therefore, Gbagbo’s counterparts and the French should tell him at his face that politics of exclusion cannot work. If the Ivorian government cannot treat the northerners as Ivorians, it should allow them to separate from the rest of the country and form their own country as they once suggested in a letter addressed to the government and copied to eight embassies in Ivory Coast. As the saying goes, the leg should be bent or stretched. If not, the only option left open is to chop it off.<br>" +
                    "<br>" +
                    "Gbagbo should also be pressurised to grapple with the problem of xenophobia and the campaign of ethnic cleansing waged by his supporters, mainly the members of his ethnic group, the betes. As reported, these militants are killing foreigners they see as a threat to Gbagbo’s political interest and northerners perceived to be his opponents. This claim is  supported by the killing of  the comedian, Yerefe Kamara who was a northern Muslim. The campaign is very inhuman and senseless. It has the danger of alienating the international community from the country and generating rancour or hatred in it, which culminates in a ceaseless war and instability. If, in a country with many ethnic groups, as is the case with most African countries, any leader who comes to power allows or incites the members of his ethnic group to brutalise members of other ethnic groups to help keep him in power, that country will never enjoy long-lasting or durable peace. In stead, there will be a vicious circle of killings, which could take ages to cut off. However, it is a pity that in many African countries, some members of the ethnic group of the head of state feel that they have more rights than the members of other ethnic groups and behave as if they own the country, brutalising perceived opponents, as is the case with Ivory Coast, defending the leader in all his acts, good or evil, just to help him cling onto power. On the other side of the divide, there are elements who endeavour at all cost to oust the head of state, regardless of whether he is good or not, simply because he is not a member of their ethnic group. This explains why members of the ethnic group of the head of state in those countries are installed in positions considered to be sensitive, not only sensitive as far as state security is concerned, but also, and may be most importantly to those involved in security matters, sensitive with regard to the security and political interest of the head of state. This clearly explains why Gbagbo’s supporters, particularly the student leader, Charles Ble Gounde, have stated categorically that they don’t want to see rebels in his government, let alone see them mount the portfolios of defence and interior. While I accept the fact that one cannot give his enemies weapons to be guarded by them, I would like to point out the fact that one should not entertain a situation which arouses anger and creates enmity in a country. For Africans to live in peace, this attitude of tribalism must change. The only way forward is to accept each other as bona fide citizens of our respective countries with equal rights. It is totally folly to reject a good leader or defend a bad leader based on ethnic or tribal sentiments. National interest should supersede individual or group interest.</font> <br>" + 
                    "<br>"
            ,
            "<font color=\"black\"><b>Lessons from the Kenyan Elections</b><br>" +
                    "<br>" +

                    "Many important lessons can be drawn from the recent Kenyan presidential and parliamentary elections. The elections, which mark the departure of the ruling party, Kanu, have been described as free, fair and transparent by the European Union observers whose view is shared by the Commonwealth observers and many others. Satisfied with the conduct of the elections, the European Union has promised to resume its direly needed aid to Kenya.  <br>" +
                    "<br>" +
                    "The leader of the National Rainbow Coalition, Narc, Mwai Kibaki has trumphed over the Kanu candidate, Uhuru Kenyatta, the son of the late president of Kenya, Jomo Kenyatta, who was handpicked by the outgoing president, Daniel Arap Moi. The bulk of the Kanu big guns have lost their parliamentary seats, including the outgoing Vice-President.<br>" +
                    "<br>" +
                    "Narc’s landslide victory is ascribed mainly to acute poverty coupled with rampant corruption which afflict Kenyans who have found the situation unendurable and hence opted for change through the ballot box. “Finally, we are free,” a rejoicing man told the BBC reporter in Kenya. This abundantly manifests the fact that there is a limit to everything and that people are always ready to extricate themselves when sufferings reach  their climax.<br>" +
                    "<br>" +
                    "The fact that Moi chose Uhuru, a political novice, as his successor infuriated many Kanu members who, as a result, defected to the opposition. Many people judged it unfair for Moi to impose an inexperienced politician on them disregarding the vastly experienced ones. Some felt that Moi just wanted to use Uhuru as a stooge after his retirement to safeguard his interest, while others believed that Uhuru would not be able to bring the required change or deliver the goods to the satisfaction of the people if elected, as Moi would be pulling the strings from behind. Uhuru vehemently denied the charges and promised to live up to expectations if elected, but to no avail. In any case, the fact that Moi’s plan in this regard has failed shows that people want to enjoy free will and that it is not advisable to attempt to impose one’s wills on others. <br>" +
                    "<br>" +
                    "Narc was formed about only two months before the elections by a large number of opposition leaders who, like Kibaki, felt the need for change and believed that that was the only way to unseat Kanu. Thus, Narc has dealt a tremendous blow to Kanu. This lends credence to the maxim ‘Unity is strength’. With strong opposition, a political system can be changed easily.<br>" +
                    "<br>" +
                    "Kanu has ruled Kenya for nearly four decades (39 years), with Moi handling the steering wheel for almost a quarter of a century (24 years)! Many Kenyans said that they were tired and fed up with the old system, which they described as rotten. This amply demonstrates the fact that it is not advisable to overstay in power, no matter how capable or efficient a leader feels. <br>" +
                    "<br>" +
                    "Well before the elections, Moi amended the Kenyan constitution to protect himself and grant himself many benefits after his retirement. Many of his compatriots found the act unfair, outrageous and vexatious, and hence wasted no time in criticising it. Now that his favourite has lost to the opposition, it is up to the latter to ruin Moi’s plans by amending the constitution again or maintain the current version to allow him to enjoy the benefits and security as desired. Man proposes and God disposes! Good governance and fair play are the solution, not political gimmicks. Although I am not averse to the idea of granting retired heads of state security and benefits, I do not endorse Moi’s deed. Constitutions should not be tailored to suit the interest of individuals at the expense of the masses, which is very common in African politics. What is the logic, if there is any, behind paying astronomical sums of money to a retired head of state- a very old man for that matter- in a country classified as one of the poorest in the world where people die of hunger and starvation? What is the point in amending a constitution to protect oneself if one is sure of not wronging or oppressing his people while in office? Moi’s act suggests great injustice and lack of mercy on his part.<br>" +
                    "<br>" +
                    "However, Moi is praiseworthy in that he chose to relinquish power peacefully rather than trying to make himself life-president as is the case with many African heads of state. His appeal to the army to support the incoming president, which he made before the official declaration of the victor, is also commendable.<br>" +
                    "<br>" +
                    "Uhuru is equally laudable. He conceded defeat while counting was still going on, unlike the former president of Benin, Soklo who accused the opposition of rigging when he was defeated at the end of his five-year term of office, which sent the whole world to uproarious laughter.<br>" +
                    "<br>" +
                    "Kibaki has promised to tackle corruption and poverty and end patronage. This is a very good promise, which I believe he will honour. The international financial institutions and the European Union had respectively suspended loans and aid to Kenya, owing to rife corruption, which they urged the authorities to try to root out. Poverty poses a great threat to Kenyans, as the majority live below the poverty line and cannot afford $1.00 worth of food a day according to reports. Moi’s reign was characterized by patronage, as implied by Kibaki and evidenced by the former’s dogged determination to impose his favourite on Kenyans. Patronage is very dangerous. Government matter should not be taken as a one-man show business. However, it is a pity that this is the norm in Africa. Many African heads of state have sweeping powers regarding appointment of functionaries but always endeavour to amass more by amending their constitutions against the will of the majority with the desire to control everything, including the movement of the fish in the sea and the monkeys in the jungle. Kibaki’s promise to unite Kenyans by forming a government of national unity and reduce the size of the government to cut down unnecessary expenses is also a right move which is worthy of commendation, judging by the importance of national unity and the adage ‘Cut your coat according to your size’. A divide-and-rule system does not yield dividends. Moreover, it does not pay to keep a large-scale government in a country where the majority of the citizens live from hand to mouth, struggling to make ends meet, as is the case with most African states. The irony here is that those governments rely heavily on loans and tax the poor masses mercilessly as a source of revenue. I quite agree with the African opposition leader who, in the early 1990s, strongly challenged the decision made by their president to increase the number of ministries, describing the move as unwise, saying that they already had a much bigger number of ministries than the US which was on a much better economic footing. He was right, for the move would only benefit the ruling clique to the detriment of the impecunious masses. The fact that education and health feature very high on Kibaki’s priority list raises high hopes and gives great impetus, for the importance of these two sectors cannot be overemphasized. His promise not to witch-hunt the members of the deposed regime is warmly welcome. As can be seen, Kibaki’s cause is a worthwhile one, which deserves every support and encouragement.<br>" +
                    "<br>" +
                    "However, he has fallen short of mentioning an amnesty to political exiles and freedom of expression, which are important ingredients of reconciliation and democracy. I hope he will grant a blanket amnesty to Kenyan exiles. I also hope that he will grant his compatriots a very high degree of freedom of expression, like the current president of Ghana, John Kuffuor, a God-sent man whose party members always echo his view that one can push a country forward without breaking anybody’s bone, asking the  rhetorical question whether countries ruled by dictatorship are more developed than those ruled by democracy. People should not be muzzled under the pretext of defending state security, nor should they be sacrificed in the name of development as implied by the former president of Ghana, Jerry Rawlings in his statement ‘You cannot make mayonnaise without breaking an egg’. Kibaki’s scathing criticism of the defunct regime in his inaugural speech in the presence of Moi does not tell well about him. He can criticise that government if he so wishes but that was not the right moment. In fact, it is better to try to learn from past mistakes and avoid them than to talk about them.       <br>" +
                    "<br>" +
                    "To conclude, I join the international community in applauding the Kenyans for their maturity in electing a leader in a peaceful and democratic manner. I congratulate Kibaki and wish him a fruitful tenure of office.</font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>“Operation Bulldozer” on the Balance</b><br>" +
                    "<br>" +
                    "There is so much controversy surrounding the operation launched recently by President Jammeh. This contentious operation, dubbed “Operation Bulldozer”, gives our security forces the green light to shoot “armed criminals” right away and mount an investigation or ask questions later. Pros see the edict as a timely initiative and thus welcome it heartily, praising its promulgator, whereas cons view it as a dangerous, imprudent and unwarranted move.        <br>" +
                    "<br>" +
                    "As we all know, the security situation in The Gambia is worrisome, characterized by mysterious killings, disappearances, arson attacks and the like, many of which are unresolved. Hence, it is indisputable that concerted, earnest, undaunted and unflinching efforts should be made to remedy the situation as a matter of urgency for the betterment of all the people residing in the country, irrespective of whether they are citizens or foreigners. Security forces are duty-bound to play a pivotal role in this regard, and civilians are obliged to co-operate fully or lend helping hands to the best of their ability. <br>" +
                    "<br>" +
                    "However, the method to be used in the crusade against criminals should be designed tactfully and cautiously in accordance with the principles of democracy and human rights so that it can yield dividends. A rash decision such as licensing security forces to shoot those regarded as armed criminals straight away might prove to be counterproductive. It has negative ramifications in that it can complicate matters or aggravate the situation.   <br>" +
                    "<br>" +
                    "Many people voice concern about the issue questioning whether our authorities are genuinely interested in weeding out criminals or reducing crime rate through the operation as they want to make us believe. Some raise objection over it arguing that there might be an ulterior motive in it and that it can be abused or used as a pretext to intimidate or eliminate opponents or perceived enemies. Can this be ruled out, given the frequent persecution of politicians and journalists in the form of arbitrary arrest and detention, incarceration and torture, coupled with the unresolved killings and disappearances under mysterious circumstance we have witnessed?  With “Operation Bulldozer”, both criminals and the innocent can fall victim of shooting which may inflict serious injury on them, or even cause their death. How will we resolve the matter reasonably or satisfactorily if an innocent person is mistaken for an armed criminal and hence shot dead, or killed deliberately (with the knowledge that he is not an armed criminal)  based on President Jammeh’s injunction? Will it be possible to bring the person back to life or compensate his/her loved ones in any way? Are we going to kill, imprison or fine the killer? In case he is jailed, will that do any good to the victim whose death could have been avoided in the absence of “Operation Bulldozer”? Will that conciliate, console, appease or pacify his loved ones? Will material or monetary compensation be enough to repair the damage? Should the killer or culprit be allowed to go scot-free based on the fact that he had acted on the order of his president? Undoubtedly, that would increase the anger of human rights defenders and the family members and friends of his victim. It will infuriate and enrage all those who love peace and justice. According to the operation, all armed criminals deserve gunshot or death, regardless of the type of arm they have in possession and the crime they have committed. Hence, it disregards the fact that the severity of a penalty should be determined taking into account the nature or gravity of the crime committed. Additionally, the operation presumes that all those suspected of being armed criminals are culpable. Thus, it runs counter to the principle that everybody is innocent in the eyes of the law until proven guilty.  In other words, the operation precludes presumption of innocence before the establishment of guilt when dealing with people taken for armed criminals, which is unjust.  <br>" +
                    " <br>" +
                    "Evidently, the launching of “Operation Bulldozer” is a cause for great concern. The operation is prejudicial and irrational. Therefore, it should be reviewed or abandoned forthwith. Although I detest armed criminals and quite agree with the idea of taking drastic measures against them or handing out a very heavy penalty to them, I do not subscribe to the idea of shooting suspects or people regarded as armed criminals without ado. I recommend using teargas, spray, or rubber bullets- in some cases- to weaken those suspected of being dangerous criminals, effect arrest and then try and sentence them accordingly. We should bear in mind that life is precious and that taking lives is no fun.  <br>" +
                    "<br>" +
                    "On a final note, I urge those involved in the operation to make it a point of duty and work indefatigably to track down and bring to book the criminals responsible for the innumerable mysterious deaths, disappearances and arson attacks that have taken place in our country if they really mean business and want to be taken seriously. If they fail in this respect, they should be bulldozed outright like the “armed criminals”   they claim they seek to crack down on under the aegis of “Operation Bulldozer”. The fact that most of those cases have remained unresolved for too long arouses suspicion in many quarters. It is interpreted as reluctance to take necessary action on the part of the authorities concerned- and most likely rightly. Sparing the perpetrators of such heinous crimes will lend credence to the suspicion of foul play. Besides, it will be seen as chasing the small fish while ignoring the big ones.</font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Pardoning Prisoners and Gambians in the Diaspora: Applaudable, but…</b><br>" +
                    "<br>" +
                    "The news of pardoning of prisoners and Gambians in the Diaspora by the Gambian leader Yahya Jammeh has been received with mixed feelings and reactions. While many people qualify it as a welcome gesture, some opine that it should be treated with caution. Jammeh’s supporters and the released prisoners have thanked him profusely and praised him highly, calling him a merciful, oft-forgiving leader, praying for him abundantly. People on the other side of the divide are of the view that Jammeh has done what he should have done long ago and hence does not deserve such commendation and praises. They believe that Jammeh should repent and seek forgiveness from his compatriots rather that treating them as wrongdoers or villains who deserve his pardon while portraying himself as an infallible being or a saint. According to them, some of those said to have been pardoned have not committed any crime and should not have been imprisoned. They also argue that the Gambians in the Diaspora have not done anything wrong that warrants amnesty or begging pardon from Jammeh, adding that he is unpredictable and as such people should always be cautious when he makes declarations of this sort, lest they get carried away and be disappointed or regret the consequences later. They contend that all Gambians have a stake in the running of the affairs of The Gambia and thus have the right to criticize Jammeh when he goes wrong. Some members of this camp see Jammeh’s move as a political gimmick, and some say he has been put under pressure to act in such a manner. <br>" +
                    "<br>" +
                    "Whatever the case may be, the fact remains that allowing the prisoners to regain their liberty has given a sigh of relief to them, their loved ones and well-wishers. Viewing the matter from this perspective, one can say that it is a step in the right direction. However, Jammeh’s “amnesty” to Gambians in the Diaspora is dubitable and leaves too much to be desired. There are strings attached to it- the condition of keeping quiet and refraining from criticizing him while in The Gambia. This strongly suggests that he aims to stifle dissent or silence his critics with his pronouncement of amnesty to Gambians in the Diaspora. Therefore, he should be reminded that Gambia belongs to all Gambians irrespective of status or position; that no condition is permanent and that it is unreasonable, unjust and imprudent to try to deny people their god-given, inalienable rights. <br>" +
                    "<br>" +
                    "At this juncture, I call on Jammeh to go a step further in his move and try to locate or set free all those who have disappeared under his watch and ensure that such disappearances without trace, mysterious killings, arbitrary arrests, detention without trial and torture stop. On a final note, I urge him to desist from issuing threats and try to cultivate the habit of addressing people in a polite, diplomatic way. As a reminder in this regard, I would like to reproduce verbatim an article I wrote in the Daily Observer newspaper of The Gambia on 12 October 2004 under the title “A rap over the knuckles”:<br>" +
                    "<br>" +
                    "Nowadays, we frequently read or hear reports of Gambians brutalizing their compatriots, threatening to kill them, boasting of having been licensed to kill them, or predicting their death, which had been alien to our society until recently.<br>" +
                    "Such beastly, immature and misguided behaviour should not go unchecked. Those involved in it should be given a rap over the knuckles or criticized blisteringly, for it has negative ramifications. This behaviour begets rancour whose concomitants are undesirable. Superfluous to say, it runs counter to the teachings of Islam, which the majority of the Gambians claim to embrace.<br>" +
                    "Islam enjoins kind treatment and forbids cruelty of all forms, including cruelty to animals. According to Islam, anybody who deliberately kills an innocent believer will be sent to hell fire: “Man qatala muminan mutahamidan fajazaa-uhu jahanan.” We are further taught by Islam that tormenting is graver than killing: “Al- fitnatu a-shadu minal qatal.”<br>" +
                    "A woman is reported to have been sent to hell for locking up a cat and denying it food for sometime out of cruelty. Our venerable prophet (SAW) banned the practice of tattooing animals and advised his followers to sharpen their blades when slaughtering animals so as to minimize their suffering.<br>" +
                    "Hence, it is flabbergasting and sickening to hear people, particularly those who claim to be Muslims, treating others with cruelty or threatening to take their precious lives for no just cause. What can they gain from this inhumane behaviour?  Nothing, except notoriety and God's wrath!<br>" +
                    "Additionally, they expose their fallacy, narrow-mindedness and lack of respect for human rights and human dignity, thereby placing their own lives in jeopardy. God has said explicitly that He honours mankind: “La qad karamnaa bani Adam.”<br>" +
                    "Besides, He created man without seeking help or permission from any human being. Therefore, anybody who sets out to afflict or kill people is challenging God the Omnipotent. Wishing people death or predicting their death is very unwise and utterly un-Islamic. One can implicate himself or have fingers pointed at him, and rightfully so, if such a wicked wish or prediction materializes. Moreover, no one knows when and where he will die, and such a prediction can backfire. God has said that no one knows on which land he will die: “Laa ya-arifu ahadun fi ayi ardhin yamuutu.”<br>" +
                    "According to Prophet Muhammad (SAW), deeds are judged by intention, and everybody gets what he intends: “Inamaa al-a-maalu bi niyaatin wa inamaa likuli imri-in maa nawaa.” It is for this reason that he advised that everybody wishes others what he wishes himself: “Hib li naasi maa tuhiba linafsika.”<br>" +
                    "It should be borne in mind that whatever pretext used to kill people is known to God the Omniscient and that those who kill, harbour killers or license people to kill others are not powerful enough to resist death or immune their agents from death or save themselves or such feeble-minded agents from God's chastisement. It is also worthy to note that no work in the service of mankind can be meaningful or beneficial or attract God's reward in default of kindness and respect for human rights and human dignity.<br>" +
                    "Thus, those merciless, sadistic Gambians who torment their compatriots, threaten to kill them, wish them death or boast of having the power or authority to kill them and go scot-free, should be enlightened if they fail to see reason an repent or kick out their nasty habit. It is incumbent on all Gambians, especially their relatives, friends and associates, to try to edify such errant people, for their acts could be detrimental to all.<br>" +
                    "One may ask: Why do people make such wicked, foolish utterances? The answer is simple. They are arrogant. Some people, by virtue of their status, become so haughty or arrogant to the extent of seeing themselves as demigods who can behave anyhow. This is particularly the case when such people believe or know fully well that it would be extremely difficult or impossible for them to attain such status under normal circumstances. I put it to those people that their aberrant behaviour is unwarranted, for there are other people of equal or higher status who humble themselves and behave maturely. Arrogance is a dangerous, unethical behaviour. According to our Prophet (SAW), anyone who has an iota of arrogance in his heart will not enter paradise: \"Laa yadkhulu aljanata man kaana fi jawfihee misqaala tharatin minal kibri.”<br>" +
                    "By behaving arrogantly, one alienates people and earns enemies. Hence, arrogance doesn't pay. Abhor it! Don't trifle with people!</font><br>" +
                    " <br>"
            ,
            "<font color=\"black\"><b>Rejoinder to Samsudeen Sarr’s Rebuttal</b><br>" +
                    "<br>" +
                    "To start with, I would like to thank you for giving me some words of wisdom and advice as a sage with a wealth of experience in different domains. That is very kind of you, my dear bother. Now, I want to proceed to the nitty-gritties without digressing much as you usually do in your writings.  <br>" +
                    "<br>" +
                    "I am inclined to believe that you don’t understand why I referred to you as a spin doctor in my piece, or that you have simply chosen to equivocate and prevaricate. I called you a spin doctor based on the fact that you always try to defend the indefensible, justify the unjustifiable and deny the undeniable in favour of your master to the detriment of your compatriots. I mentioned your flip-flops to back my argument that you have no moral authority to accuse others of double standards, and this applies to your master. I am not averse to attitudinal change as implied in your rebuttal, nor do I believe in rigidity in stance. However, I disapprove of attitudinal change and change of position from better to worse, motivated by material or political gain, as in your case. To me, that is sycophantic, opportunistic and objectionable. Hence, I still regard you as a spin doctor. I hope this clarification has satisfactorily answered your question whether I would call Barack Obama a spin doctor for changing US stance and policy towards Cuba and reconciling the Americans with the Cubans. To be precise, I vociferate that I would not call him a spin doctor. I would rather extol and eulogize him as a statesman, unlike your master who has the nasty habit of alienating and abandoning his allies after benefitting immensely from them, as he has done with Iran, Libya and Taiwan.  <br>" +
                    "<br>" +
                    "I am disappointed that you have not answered the questions I posed and failed to address most of the issues I raised. You have digressed too much as a way of evading the questions. You have resorted to castigating the US which you ironically have adopted as your new home after fleeing from your master, claiming that the Whites in general are against your master and that they are the only ones denouncing him for his human rights violations based on racism.  Judging by these complaints and your lamentation in your previous article that the African leaders treat your master unfairly by denying him the chance to head their regional bodies, despites his “vast experience” as a long-serving head of state, one can rightly conclude that there is something wrong with him. Would you dare tell us that the whole world is wrong and your master right? If you really love your master as you want to make him and his blind loyalists believe, you should advise him to change his attitude as you have advised me to do, rather than blaming people for condemning his atrocious behaviour. I think you don’t love me more than you love him. Anyway, I stand to be correct. Besides, you should advise him to stop going to the Whites and sending his family members to them for medical treatment, lest the Whites harm them as they “hate” him. Since he can cure all diseases- including mysterious ones- using traditional medicine, it is neither logical nor advisable for him to seek medical treatment from his “enemies”. Additionally, it would be of immense benefit and a great favour for him and his family if you could kindly discourage him from sending his wife to the US for delivery, as that is unwise and imprudent. As a “pan-Africanist” and a sworn enemy of the West, I wonder why he prefers having his children born on Western soil to having them born on African soil. That is the climax of inconsistency, hypocrisy and irony! <br>" +
                    "<br>" +
                    "Even if the Americans violate human rights outside the US as you have indicated, that doesn’t give your master the licence to brutalize his compatriots whom he has sworn to serve without fear or favour, affection or ill-will, and doesn’t deny us the right to criticize him as Gambians when he goes wrong. If you are really fair with Gambians and wish them well as you always claim, you should do your best to dissuade your master from violating their God-given, inalienable rights, or at least keep quiet and refrain from defending him in case of human rights violation as you did recently, incurring the wrath of your compatriots. Do you value the lives of those you say the Americans have violated their rights more than the lives of your fellow Gambians? That is exactly what you have demonstrated with your attitude. You don’t care about the welfare of Gambians. Personal interest supersedes national interest in your book. The fact that you have the guts to criticize the US authorities while residing in the US but lack the courage to criticize the Gambian authorities while in The Gambia clearly shows that the Americans are much more tolerant than your master.   <br>" +
                    "<br>" +
                    "Your claim that the Whites are the only ones censuring your master for human rights violations doesn’t hold water. People of all races, tribes, religions and colours- particularly Gambians- condemn the human rights violations under your master’s reign. A prominent Gambian politician and human rights defender defied your master when he sent his sorcerers to force Gambians to drink concocted poisonous, hallucinating liquid in the name of hunting suspected witches and wizards. Many people lost their lives during the exercise, with many more falling gravely ill. Your master was infuriated by the defiant stance of that great man, who vowed to stop that abhorrent, repugnant witch-hunting exercise by documenting and exposing it globally, saying that he was ready to die to save the lives of others who might fall victim. He was arrested under the instruction of your master, charged with opposing a government policy on witch-hunting and taken to court. However, your master abruptly backed down and released him, cognizant of the embarrassment the trial would cause for him. Your master’s act runs counter to the concept of pan-Africanism which he claims to embrace. A pan-Africanist calling Africans witches and wizards in this century! Isn’t that ironic? I only hope that you will not try to defend him or justify this barbaric act of his. Your master used to throw biscuits on the road for children to pick while travelling in his convoy. Many children have been crushed to death by speeding vehicles in the convoy. Again, a Gambian newspaper with which the aforementioned brave human rights defender is associated strongly condemned the practice and wrote to your master’s office on several occasions, appealing to him to desist from the despicable practice. Many other Gambians voiced their anger and denounced the brutal acts but your master remorselessly and vaingloriously turned deaf ears and blind eyes, leading people to believe that his acts were meant to trap and kill children as human sacrifice. Hence, Gambians and other people- regardless of race and colour- are concerned about your master’s human rights violations and condemn them accordingly, contrary your claim that only white people criticize your master for human rights violations and do it out of racism. Your master, as a self-proclaimed pan-Africanist, should be ashamed of being told by the Whites to respect the rights of his people and treat them fairly and justly. What is your take?<br>" +
                    "<br>" +
                    "You have asked me where I was when the Americans were planning to go to war in Iran in 2003, with the aim of eliciting my reaction on the matter and- at the same time- prove that the Americans don’t respect human rights. My answer is that I was in the United Kingdom. As for my reaction, I gave it at the time. I wrote a lengthy article on the issue, entitled War on Iran. To summarize that article for you, I proceed thus: I condemned the acts of the then British Prime Minister, Tony Blair and those of the US President, George W Bush in the strongest possible terms, as both of them were unseasonably obstinate and adamant in their position of ensuring the removal of Saddam at all cost. I mentioned how they fabricated and doctored evidence in their earnest efforts to convince their people and the world at large that uprooting Saddam was a worthwhile venture, which I judged utterly wrong. I explained how Tony Blair’s spin doctors- your ilk- hurriedly lifted a huge chunk from the thesis of an Iraqi student of the University of Cambridge- without even bothering to rectify the grammatical errors in it- with a view to using it as evidence against Saddam. I analysed Nelson Mandela’s statement that Blair was behaving more like a US secretary of state than a British prime minister in his blind support to Bush, and why the British press branded Blair poodle (a kind of dog) for Bush. I also made it crystal clear that I was not the least convinced that Bush and Blair wanted to remove Saddam Hussein for the purpose of guaranteeing peace and security and salvaging the Iraqis as they claimed. I pointed out that they had set a bad, dangerous precedent by defying the United Nations and acting in isolation of the world, interpreting their acts as sheer arrogance. I went further to denounce Saddam who, like your master, had no regard at all for his people and as such treated them with utter disrespect and contempt, and brutalized them exceedingly. In addition, I condemned his querulous, aggressive behaviour towards his neighbours; he fought an eight-year long war with Iran and later invaded Kuwait, which I believe was the cause of his downfall. In both cases, he confessed to his wrong deeds after the colossal human and material damage had already been done, claiming that he was remorseful. Saddam once ordered his first cousin Ali Hassan Abd al-Majid al-Tikriti, who was nicknamed Chemical Ali due to his notoriety and use of chemical weapons against Saddam’s opponents and perceived enemies, to fly a helicopter over a densely populated area in Iraq to spray the residents (Kurds) with chemical. Thousands of people died like insects during that brutal operation, and many got seriously injured. I was filled with indignation after watching the horror video of the operation in a language lab in Saudi Arabia when the 1991 Gulf war was about to start. Saddam boastfully dubbed that war the mother of all battles at the beginning but ended up suffering a humiliating defeat in it, surrendering unconditionally after brutalizing the people of Kuwait, looting some valuable properties in Kuwait and destroying others, and sending missiles to Israel and Saudi Arabia. Although I totally disagreed with Bush and Blair in their stance and acts, I don’t believe they could or would brutalize their own people as Saddam used to do. As you can see, Mr Sarr, I believe in the saying that injustice anywhere is injustice everywhere, unlike you who condone, endorse, defend and justify injustice and cruelty in your own country but denounce them when they happen elsewhere.  <br>" +
                    "<br>" +
                    "You have hailed me for disclosing my identity in my piece, implying that you are surprised that I have the courage to do so and that many of your critics lack the courage to come in the open. So you cherish the illusion that people are afraid of you, just like your master. You have manifested your arrogance with your remarks. Why do you think people should fear you to the extent that they conceal or hide their identities when criticizing you? If people are brave enough to criticize your master openly, why do you think they lack the nerve to do the same thing with you? Point of correction: I am not the only one who has criticized you openly. Many other Gambians have criticized you verbally and in writing revealing their identities. People will continue to criticize you as long as you comment on issues affecting them. Make no mistake about that!  <br>" +
                    "<br>" +
                    "You have interpreted my feelings and personality negatively based on my photo. I have no comment on this. Those who know me personally are in a better position than me to judge whether your interpretations are correct or incorrect. However, your interpretations have reminded me of your master’s claim that he can tell a person’s character by simply looking at her/his photo. In an attempt to mystify himself as usual, your master claimed at a recent rally in Sukuta that he told one of his ministers during their salad days that his girlfriend was not a good person and advised him to ditch her, saying that he reached that conclusion just by looking at her photo. According to him, he was later vindicated, as the lady was caught messing around. Interesting! Isn’t? Everybody was astonished and dumbfounded. His audience expected him to address the pressing issues affecting his people rather than bombarding them with trivialities and implausible claims. Like I said in my previous piece, you resemble your master. People who can make such claims are capable of claiming anything, unmindful of how others view them. Your untenable, absurd and ridiculous claims have unmasked you, giving a clear picture of who you and your master really are. Let the readers be their own judges! </font>  <br>"
            ,
            "<font color=\"black\"><b>Second Rejoinder: Refuting The Satanic Views Of Samsudeen Sarr</b><br>" +
                    "<br>" +
                    "I have read your second rebuttal with keen interest and rapt attention. Many people have advised me not to waste my time arguing with a disreputable character like you.  However, I think it is necessary to engage you once more, as some of the issues you have raised need to be addressed. I unreservedly apologize to those people for not paying heed to their advice and hope that they will understand my position.<br>" +
                    "<br>" +
                    "Mr Sarr, I am not the least convinced with the lame excuse you have given for not answering my quests- that you didn’t consider me serious in asking those questions. It is implausible, to say the least. The fact of the matter is that you are short of answers. Those questions have proven to be vexed, puzzling questions for you. You know very well that any attempt to answer them would throw you into a bottomless ditch. That is the very reason for dodging them.<br>" +
                    "<br>" +
                    "I understand that you judge people by yourself. That is why you have described your master’s critics as angry, frustrated people, advising me to register for anger management courses. That is exactly what you experienced when you were opposing your master as an arch-critic, prompting you to seek reconciliation with him. I believe you attended anger management classes during that period. I also hope that you will advise your master to attend such classes. In so doing, he may be able to manage his behaviour as a cantankerous, belligerent, irascible and eccentric leader and stop quarrelling with the world thinking fallacious that he is the only one capable of reasoning. Mr Sarr, your belief is erroneous. Your bitter experience and unsavoury past don’t apply to everybody, and we are not as weak as you are. Bear that in mind! <br>" +
                    "  <br>" +
                    "You have demonized those who had attempted to dislodge your master Yahya Jammeh, hinting that they don’t deserve pity or mercy as they had killed or intended to kill soldiers who were at the service of their country. I hereby express by belated condolences and sympathy to the loved ones of the victims and pray that their gentle souls rest in perfect peace. Mr Sarr, I hate violence and hence would not encourage it. However, I regret that it is extremely difficult to avoid violence when dealing with Jammeh. He has vowed to eternalize his stay in power. Added to this is the incontrovertible fact that he treats people with contempt and cruelty, ridiculing his opponents all the time. To my understanding, he doesn’t love peace at all as he claims. At this juncture, I would like to put it to you that your master is the root cause of the violent incidents (coup attempts) that have taken place in our dear country since he came to power. He has set a dangerous precedent by overthrowing a democratically elected president. Besides, he keeps on celebrating his coup lavishly, which has the danger of arousing the envy of other soldiers. One may argue that his coup was bloodless, but the counter argument is that the aftermath is bloody. Thus, it makes no sense at all to lay the blame squarely on the feet of those who have attempted to overthrow your master. To me, he is to blame. You should shut your chatterbox if you lack the courage to tell the truth. Now, let me remind you and your master of the maxim “He who lives by the sword will die by the sword” and “What is obtained through snatching can be lost through snatching”. Mr Sarr, I am baffled that you now refer to your master’s coup as a revolution. The term revolution is a misnomer to me, as far as his coup is concerned. Are you not the one who authored the book “Coup d’état by the Gambia National Army”? It was a coup d’état then but a revolution now, simply because you have reconciled with your master. You are seeking to please him once again by glorifying his coup d’état, calling it a revolution. I hope it will not revert to a coup d’état when you fall apart with him again. Well, that cannot be ruled out, given your inconsistency. It is highly hypocritical of you to glorify your master’s coup and denounce others.<br>" +
                    "<br>" +
                    "I am not in a position to confirm or deny your allegation that the Senegalese authorities have harboured Gambians who had planned to launch attacks against your master to decapitate his regime. However, I want to remind you that your master has been accused in many quarters of harbouring Casamance rebels. Besides, it is an open secret that he accommodated a coup plotter, General Bubu Na Tchuto of Guinea Bissau and gave him VIP treatment when he fled to The Gambia. If you are genuinely interested in regional and world peace and security as you want to make us believe, you should advise your master accordingly in this regard. If you and your master can accuse other countries of aiding and abetting those who aim to depose him using violent means, he should make sure that he is not seen or suspected to be doing the same thing. What is good for the goose is good for the gander! Oh, I have forgotten! It is one rule for Jammeh and another rule for others. That is what you and Jammeh believe.<br>" +
                    "<br>" +
                    "You have tried to give the impression that The Gambia under Jammeh is heaven-on-earth. Yet, you have told us that you travelled to America to tap your potentials better. In other words, you travelled to America to look for a better life, or greener pastures, as others would say. If things are alright in The Gambia as you want to fool us into believing, why didn’t you stay there and tap your potentials? Mr Sarr, it is impossible to sell the idea that you fled a country where the human rights situation is good and sought political asylum in a country with a poor human rights record as implied in your writings. Only a credulous fool can believe that. You have told us that you know Jammeh makes mistakes but his good deeds outweigh his bad deeds by far. However, you have never mentioned or pinpointed any of his mistakes or misdeeds as you do with American presidents. Why this posture? Is it that American presidents make more mistakes than Jammeh, or that you fear Jammeh more than you fear them?<br>" +
                    "<br>" +
                    "You have lamented that your master’s opponents customarily castigate him, accusing me of insulting you and Jammeh. Mr Sarr, Jammeh is notorious for using foul language. He has called journalists illegitimate sons of Africa, and the opposition donkeys and dogs. Besides, he has branded dissidents liars. You have got your own share, as you have been labelled as a pathological liar with no scruple on TV by Jammeh- the one you ardently defend and expect people to treat with utmost respect. As for you, you have been very harsh and uncharitable with me in your reactions to my criticism. You have used extremely vulgar language to characterize me. Mr Sarr, I have not said about your master anything close to what he has said about other people and what you yourself have said about him. In your book which I mentioned earlier, you have portrayed Jammeh as a malnourished, rough, naïve, immature and unpresentable person at the time of his coup. In addition, you have explained how he always tries to mystify himself, and- in your own words- does it in a very embarrassing manner. You have narrated what transpired when you accompanied a foreign delegation to Kanilai with ministers and other dignitaries. According to you, Jammeh wanted to give you the impression that he communicates with bees. Your narration continues thus: Jammeh asked his visitors to follow him to a big tree where there were bees. As they got close to the tree, he warned them to stop in order not to be stung by the bees. Jammeh continued walking to the tree raising his hands and murmuring some strange words, pretending to be talking to the bees. All of a sudden, he turned one hundred and eighty degrees and started running. He ran as fast as a deer, fanning himself with his hands. On seeing him, the visitors ran helter-skelter as fast as their legs could carry them, taking different directions. Jammeh was stung by the bees all over his body. He entered a small room in Kanilai village where he was nursed by a group of women. The women later came out and told the visitors that the bees were angry with Jammeh because he failed to visit them for too long. According to you Mr Sarr, Jammeh was the very one who asked the women to convey that message to you just to camouflage the embarrassing situation in which he found himself. You have also recounted how Jammeh tried to protect the military camps after one of them was attacked. The story goes like this: Jammeh secretly sent some people to bury salt in all the camps. They were caught by some soldiers who didn’t know that they were agents of Jammeh, and the matter was reported to him. Jammeh confessed to having sent them. He explained the purposed and promised that what had happened (the attack) would never happen at any camp again. When a second camp was attacked, Jammeh told soldiers that the attacked would be worse if he did not take that measure. You told us after your account that you expected him to accept the fact that what he did had no effect rather than trying to mystify himself as usual and fool you. Mr Sarr, this is just the tip of the iceberg. None of Jammeh’s critics has treated him with disrespect and disdain or offended him more than you have done. Thus, it is mindboggling for you to blame people for what they say about him. No amount of defence or praise-singing can undo what you have done to caricature Jammeh and tarnish his image. You are now treating him as a fool by pretending to love him, but I don’t think he is as foolish as you consider him to be. Jammeh is fond of saying “Give a fool a long rope to tie himself”. He has now given you a rope. It is a matter of time to see whether you will tie yourself or not. Beware!<br>" +
                    "<br>" +
                    "You have mentioned Imam Baba Leigh in your piece, referring to him as my Imam. I am proud to have him as my Imam as long as he remains truthful, and I am confident he will. You can call him my hero and teacher as well if you so wish. You have projected Imam Leigh negatively, blaming him for his ordeal. This is due to the fact that he has flatly refused to lend himself to the services of the dictator but chosen to fight for justice and respect for human rights. I know he can defend himself to the fullest. Nonetheless, I feel obliged to contribute my quota in defending him to the best of my ability, since you have drawn him into the debate and associated him with me. The problem with you and your gang members and other opportunists and flatters is that you expect all religious leaders to dance to Jammeh’s tune and serve as his propaganda tools. You expect them to praise Jammeh and defend his misdeeds or turn blind eyes to his excesses. When a religious leader criticizes Jammeh, you label him as a politician, saying that he should not be involved in politics. The hypocrisy here is that you never tell religious leaders who are loyal to Jammeh not to meddle in politics. You have got it wrong, Mr Sarr. Not everybody can behave as you wish. You are just like the former president of Zambia Frederick Chiluba of blessed memory who told the members of the church to shut up when they cautioned him against modifying the constitution of his country with the aim of clinging onto power at the end of his second term in office. He argued that the issue was purely political and had nothing to do with God and religion. They told him that they had a stake in the running of the affairs of their country and that they would not be able to worship God or practise their religion without political stability. They made it categorically clear to him that he would be held fully accountable in case of crisis. They fought him tooth and nail and ensured that he failed woefully in his third-term bid. You see, Mr Sarr, politics is everybody’s business, regardless of the individual’s occupation and religious and social status. Islam is all-embracing and would be incomplete and meaningless if it failed to encompass politics. In fact our prophet (pbuh) doubled as a religious leader and head of state, and his disciples who succeeded him played the same dual roles. That state, it can be said, had the three arms of government, namely: The Executive (the prophet and his disciples), the Judiciary (judges) and the Legislature (the Holy Qur’an and Hadith). There was also Baitul maal, which can be interpreted as Treasury. The state consisted of regions, each of which was headed by a governor called Amir. Hence, it is impossible to divorce Islam from politics, as it is wrong to suggest that a religious leader should not talk about politics. Talking about politics doesn’t necessarily make a religious leader a politician. I would say that talking about politics is a socio-religious obligation. What is wrong is to connive with a dictator for personal interest, or to help a despot to suppress or oppress people. The prophet (pbuh) has said: “Anyone who sees and evil act should try to change it using his hand. If he is not able to, let him use his tongue. If that is not possible he can use his heart, and this is the weakest (lowest degree) of faith. The prophet (pbuh) has also said: “The best jihad (crusade/fight in the cause of Allah) is to tell the truth before/in front of a tyrant.” There is an Islamic principle which says “Don’t obey or show loyalty to the creature (a human being) to the extent of disobeying or wronging the creator (God).”  Mr Sarr, you can see that what my Imam is doing is in line with the teachings of Islam. It can also be deduced from the foregoing elucidation that blind loyalty to a leader, which you and your fellow sycophants advocate, is against the Islamic principles. Thus, it is not correct for you to say that my Imam is poking his nose into politics. He is doing what he is supposed to do. Mr Sarr, you are very unfair with my Imam. With all the sufferings inflicted on him by Jammeh, you want to shift the blame to him and absolve Jammeh, making him the victim of wrong treatment on the part of Imam Leigh. How on earth can you justify his kidnapping and long detention incommunicado without trial? Even if he committed a crime, which is far from being the case, he should not have been treated in that manner. He should have been charged and taken to court. Jammeh had no case against him. Mr Sarr, you are stone-hearted, or heartless I should say. You have argued that Imam Leigh is faulty as he is the only Imam among the lot defying your master continuously. Yet, you want to make us believe that Jammeh who defies the entire world is right and everyone else wrong. To buttress your point, you have blamed the African leaders and Western leaders claiming that they conspire against Jammeh. In summary, you are telling us that Imam Leigh is wrong because his views differ from those of the remaining Gambian Imams, but Jammeh is right even though his views differ from those of African and Western leaders- the whole world, by extension. What sort of logic is this? You have decried Imam Leigh for his position on the executions, suggesting that he should have behaved like the other Imams- your Imams. You have also attempted to defend Jammeh saying that those executed had been sentenced to death. Mr Sarr, the manner in which the executions were carried out aroused suspicion. Jammeh first denied the executions, only to turn around and confirm them, which strongly suggests that he had something to hide. Besides, he refused to hand the bodies of the executed convicts over to their relatives for decent burial. Additionally, he failed to notify the Senegalese authorities prior to the executions which included two Senegalese. Legal luminaries argued that there were legal issues that had not been addressed fully, and reports had it that the group included a man who was mentally imbalanced. These facts lend credence to the widely held belief that the executions were carried out for the purpose of human sacrifice, and not law enforcement as Jammeh and his bunch of spin doctors claimed. Your Imams should have advised your master to release the bodies. They know very well that keeping them and refusing them decent burial runs counter to the teachings of Islam.  Mr Sarr, it is not a crime for my Imam to give his views on the matter, and nor is it against Islam to do so. Therefore, it is wrong for Jammeh to kidnap him for merely expressing his views on the issue based on his knowledge of Islam. His kidnapping is unjustifiable, but you are adamantly trying to justify it and other human rights abuses perpetuated by your master. Your views are satanic, and your arguments groundless and seriously flawed.<br>" +
                    "<br>" +
                    "God save us! Amen!</font><br>"
            ,
            "<font color=\"black\"><b>You are a spin doctor! </b><br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "You have rubbished the recent HRW (Human Rights Watch) report on our beloved country,<br>" +
                    "In your attempt to defend your master,<br>" +
                    "Exposing your mercilessness, pitilessness and insensitivity to the ordeals and sufferings of your compatriots in the process<br>" +
                    "You have judged the report incredible and unfair,<br>" +
                    "Based on its summary,<br>" +
                    "Accusing HRW of over-generalization,<br>" +
                    "Arguing that they have failed to cite the names of the torture victims who the report says had been forced to drink hot oil and burnt with hot plastic liquid<br>" +
                    "Even though the report has not made mention of names in this regard, that is not enough reason to rubbish it in its entirety, <br>" +
                    "Or deny the prevalence of human rights violations in our country<br>" +
                    "The report is accompanied by a video,<br>" +
                    "Featuring torture victims narrating their pitiful, pathetic ordeals<br>" +
                    "Are you telling us that those people are narrating cock and bull stories?<br>" +
                    "Isn’t it mockery to suggest that the victims are telling fairy-tales?<br>" +
                    "Can you deny that some of them had been detained incommunicado for too long without trial, which constitutes human rights violation?<br>" +
                    "Does it make sense to deny that they had been tortured, despite the fact that some of them have signs of torture on their bodies?  <br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "It is an irrefutable fact that many people have been killed mysteriously during your master’s reign,<br>" +
                    "And many have disappeared without trace as indicated in the report,<br>" +
                    "With the cases remaining unresolved,<br>" +
                    "Despite the fact that he is good at uncovering coup plots and punishing the culprits <br>" +
                    "He always flies into a rage when crimes against his compatriots are mentioned by human rights defenders,<br>" +
                    "As evident in the case of the murdered journalist,<br>" +
                    "In which he has told those who want to know the killers to go to his grave and ask him who killed him,<br>" +
                    "Provoking his colleagues who reacted befittingly,<br>" +
                    "By telling him that they expected him to mounting a thorough investigation to get to the bottom of the matter,<br>" +
                    "In order to shed light on it and punish the perpetrators accordingly,<br>" +
                    " Rather than treating the deceased with disrespect and increasing the agony of his family members and loved ones<br>" +
                    "That reaction infuriated your master,<br>" +
                    "And prompted him to send the journalists to jail<br>" +
                    "This lends credence to the allegation that your master has something to hide in the case, <br>" +
                    "And hence unwilling   to track down and punish the perpetrators of that heinous crime<br>" +
                    "Your master’s reluctance to take necessary action in the crimes mentioned in the HRW report clearly demonstrates that he lacks interest in protecting his compatriots as he has sworn,  <br>" +
                    "And strongly suggests that he is complicit in all the crimes<br>" +
                    "Can you exculpate or exonerate him with this behaviour?<br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "You have tried to defame and discredit your master’s predecessor,<br>" +
                    "Portraying him as man of inconsistencies,<br>" +
                    "Accusing him of playing double standards,<br>" +
                    "Trivializing and downgrading his achievements in terms of development,<br>" +
                    "Highlighting and over-exaggerating those of your master,<br>" +
                    "Ignoring the innumerable shortcomings of your master<br>" +
                    "This has jogged my memory to the numerous inconsistencies of your master and your own inconsistencies<br>" +
                    "Your mater advanced the argument that his predecessor overstayed in power and presided over a government whose members were only interested in enriching themselves and leading a flamboyant lifestyle,<br>" +
                    "As a way of justifying his coup,<br>" +
                    "Saying that even ten years in power is too long a time,<br>" +
                    "Promising that no one would be allowed to overstay in power again,<br>" +
                    "Claiming that he and his comrades didn’t seize power to enrich themselves,<br>" +
                    "But to bring sanity by righting wrongs <br>" +
                    "However, you master has now manifested dogged-determination to cling onto power at all cost<br>" +
                    "He has openly vowed to overstay his welcome,<br>" +
                    "Saying that neither election nor coup d’état can remove him from power,<br>" +
                    "Cracking down on the opposition,<br>" +
                    "Changing the electoral laws to disadvantage them and facilitate victory for himself,<br>" +
                    "Modifying the constitution to equip himself with sweeping powers,<br>" +
                    "Which he uses as a weapon of suppression and repression,<br>" +
                    "Flatly rejecting the idea of presidential term limit<br>" +
                    "To add insult to injury, your master amassed wealth in the twinkle of an eye,<br>" +
                    "And started living an ostentatious lifestyle, <br>" +
                    "Spending lavishly,<br>" +
                    "Leading people to believe that he is richer than the state,<br>" +
                    "And unscrupulously declared that he is so rich that his great grandchildren will never experience poverty<br>" +
                    "You wrote a book and a number of articles critical of your master after he gave you the sack and jailed you,<br>" +
                    "Lambasting, lampooning, caricaturing and ridiculing him,<br>" +
                    "Projecting him as a half-baked person who is under the influence of inferiority complex,<br>" +
                    "Trying to mystify, glorify and aggrandize himself by portraying himself as man with supernatural powers and vast knowledge in everything<br>" +
                    "But you later turned around and told the whole world that you have regretted what you had written against your master,<br>" +
                    "Saying that you were driven by emotions and anger,<br>" +
                    "Implying that your writings are full of canards and false allegations, <br>" +
                    "And started heaping praises on him,<br>" +
                    "With the aim of reconciling with him<br>" +
                    "You now serve as his spin doctor, propagandist and image-maker,<br>" +
                    "Criticizing his opponents day in day out,<br>" +
                    "Labelling them as unpatriotic citizens who do not wish their country well<br>" +
                    "In spite of your fervent, over-zealous support for your master, he has denounced and shamed you on national TV,<br>" +
                    "By qualifying your book as a pack of lies,<br>" +
                    "Aptly describing you as a compulsive continental liar,<br>" +
                    "Deriding and scorning you,<br>" +
                    "Branding you an ungrateful person,<br>" +
                    "Claiming that he is the one who made you by elevating you to a very high position in your army, <br>" +
                    "Asserting that you were not qualified enough to head even a small unit of the army  <br>" +
                    "Hence, you and your master are not morally justified in accusing people of playing double standards<br>" +
                    "You are a clone of your master- a carbon copy of him<br>" +
                    "You play quadruple standards in your acts and utterance as your master does,<br>" +
                    "And never practise the good things you preach<br>" +
                    "You try to fool us into believing that your master is indispensable and should thus be allowed to stay on as a life president,<br>" +
                    "Using his development projects to back your arguments,<br>" +
                    "Claiming that his predecessor failed to bring development for his compatriots,<br>" +
                    "I would like to remind you that your master does not use his own money to bring us development<br>" +
                    "His projects are financed by taxpayers and donors,<br>" +
                    "And that development is meaningless where people’s rights are blatantly and grossly violated,<br>" +
                    "As human resources are more important than material resources,<br>" +
                    "In fact human beings make materials, and not the other way round<br>" +
                    "Therefore, a leader who respects people’s rights and brings limited development is better than one who uses people’s own financial resources to bring them development and violates their rights by brutalizing them<br>" +
                    "Does development mean anything to an agonized, enslaved or dead person?<br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "I understand that you are trying to use a tribal card to please your master, <br>" +
                    "And denigrate his opponents, rivals and perceived enemies,<br>" +
                    "For the purpose of dividing them,<br>" +
                    "With the ultimate goal of helping him to consolidate power and perpetuate himself in power,<br>" +
                    "And ingratiating yourself with him or gaining his favours<br>" +
                    "You have highlighted and extolled the virtues of the tribe of your master which I would not dispute,<br>" +
                    "Claiming that they were regarded with contempt during the reign of his   predecessor,<br>" +
                    "Contending that people find it difficult to accept your master as a leader due to this contempt towards his tribe,  <br>" +
                    "And pinpointed the vices of other tribes but failed to say anything positive about them,<br>" +
                    "As though they don’t have anything good <br>" +
                    "My response is that all our tribes exhibit virtues and vices,<br>" +
                    "And that not all those criticizing your master or vying to replace him as a leader are contemptuous of him by virtue of his tribe as you claim <br>" +
                    "You have denounced members of the previous regime,<br>" +
                    "Accusing them of tribalism and nepotism,<br>" +
                    "But have fallen short of condemning the tribal remarks made customarily by your master, <br>" +
                    "And his conspicuous nepotistic tendencies<br>" +
                    "You are neither fair nor sincere in your analysis  <br>" +
                    "You are swimming in dangerous waters<br>" +
                    "Do you think you can convince sensible people with your preposterous, lame arguments? <br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "You have lamented that the HRW and your master’s opponents criticize your master based on his stance regarding homosexuality while sparing the Senegalese president,<br>" +
                    "Despite the fact that gays have been prosecuted and handed heavy sentences in Senegal<br>" +
                    "I would say in response that your master is the victim of his own utterances and rash acts,<br>" +
                    "He makes too much noise on the issue,<br>" +
                    "As if homosexuality has the potential to fell the sky on us, <br>" +
                    "And publicly threatens to behead gays and lesbians, <br>" +
                    "Besides persecuting and prosecuting them,<br>" +
                    "Whereas the Senegalese president never issues death threats against them,<br>" +
                    "In spite of the fact that he doesn’t subscript to homosexuality,<br>" +
                    "But allows the law to take its course on the issue<br>" +
                    "This is substantiated by the fact that he diplomatically turned down the plea made by the US president for him to legalize homosexuality,<br>" +
                    "During his visit to Senegal<br>" +
                    "He conveyed his message eloquently without hurting the feelings of his guest and LGBT right activists,<br>" +
                    "Telling him politely that homosexuality is against Senegalese religion and culture<br>" +
                    "This is what is expected of a charismatic leader,<br>" +
                    "Not tirades that antagonize and alienate allies,<br>" +
                    "Used to impress listeners or portray oneself as a brave or courageous leader<br>" +
                    "Who is to blame, your master of HRW?<br>" +
                    "  <br>" +
                    "You are a spin doctor!<br>" +
                    "You usually compare the US with your country of origin in terms of human rights violation,  <br>" +
                    "Trying to give the impression that the latter is better than the former,<br>" +
                    "Despite the fact that you fled and sought asylum in the US with your family,<br>" +
                    " After you were released from prison in your country of origin,<br>" +
                    "Where you were incarcerated by your master,<br>" +
                    "And later naturalized as US citizens<br>" +
                    "What an irony!<br>" +
                    "Why did you flee to the US if their human rights record is worse than that of your country of origin?<br>" +
                    "Why didn’t you stay in your county or choose another destination after your release from Mile II Prison which your master mockingly calls his Five Star hotel?<br>" +
                    "Were you oblivious to the “poor” human rights record of the US at the time?<br>" +
                    "Now that you have realized that the US doesn’t respect human rights, would you renounce your US citizenship and that of your family members and send them back home to enjoy their rights better? <br>" +
                    "Can you ask your master the rationale or logic behind purchasing an expensive mansion and sending his daughter to study in a country where human rights violation is the order of the day as you imply in your writings? <br>" +
                    "Will you advise your master to sell his multimillion dollar house in the US and withdraw his daughter from the expensive US boarding school she is attending and enrol her at a Gambian school to ensure that her rights are not violated?<br>" +
                    "<br>" +
                    "You are a spin doctor!<br>" +
                    "Your reconciliation with your master can be described as a marriage of convenience,<br>" +
                    "Because he needs you as a spin doctor and you need him as an employer<br>" +
                    "But I bet your task as a spin doctor for him is the most daunting, arduous and laborious one, <br>" +
                    "And that you shouldn’t feel secure in your job as a diplomat,<br>" +
                    "Given the erratic, mercurial behaviour of your master<br>" +
                    "You cannot polish the battered image of your master,<br>" +
                    "As the damage is irreparable,<br>" +
                    "And he continuously aggravates the irremediable situation <br>" +
                    "Your task can be likened to trying to keep clean somebody who habitually wallows in mud,<br>" +
                    "And your job an iron ball resting on a spider’s web<br>" +
                    "You must be living in a fool’s paradise if you think otherwise!<br>" +
                    "Do you really believe that you will live up to expectations in your role as a spin doctor and remain in the good books of your master to be able to maintain your job as a diplomat?<br>" +
                    "Time will tell! </font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Third Rejoinder: Gaye’s Theory Of Unravelling Jammeh</b><br>" +
                    "<br>" +
                    "Welcome back, Brother Samsudeem Sarr! It is good and gladdening that you are determined to carry on contrary to your decision to withdraw, which you announced earlier. I am equality committed. Rest assured that I will not hesitate to take you on or respond appropriately if and when I deem it necessary. I am immeasurably beholden to you for furnishing me with more information and materials to use in the debate. You have motivated me to put on my thinking cap and ponder more, thereby coming up with a theory dubbed “Gaye’s Theory of Unravelling Jammeh”, as you shall see later in this article.<br>" +
                    "<br>" +
                    "You have alleged that I am advocating the adoption of the Islamic political system introduced by our prophet (pbuh). Your allegation is false and misleading, grounded in misinterpretation and misrepresentation of facts. It shows clearly that you have not understood my message. Therefore, I consider it necessary to set the record straight. I explained that system of government simply to drive home the point that our prophet (pbuh) was a political figure in addition to being a religious leader and that it is impossible to separate Islam from politics. I also aimed to disprove the widely harboured notion that a religious leader should not talk about politics. In fact, I explained how Zambian Christians succeeded in tackling a president who wanted to amend their constitution with the aim of perpetuating himself in power. Why haven’t you accused me of championing the use of the Ten Commandments of the Holy Bible to rule The Gambia based on this explanation? I am fully cognizant of the fact that the generation of our prophet (pbuh) is quite different from ours and that The Gambia is a secular state, which makes it unfair and practically impossible for us to embrace that Islamic system of government. If there is anybody advocating the adoption of an Islamic system of government, it is your master Yahya Jammeh. He pretends to be more pious than Prophet Muhammad (pbuh) himself, and we all know that he does this for the sole purpose of gaining monetary favours from rich Arab countries. He has built a mosque at the State House and failed to build a church there. Besides, he has once declared his intention to adopt Sharia laws. That triggered a heated debate and led to the sacking of the GRTS journalist who made the announcement. In addition, we always hear Jammeh say “We are Muslims, we cannot accept this in our country,” as if Islam is the only religion practised in The Gambia. Hence, it is hypocritical of you to accuse me of calling for the espousal or adoption of an Islamic system of government and spare your master, even though you have failed to understand my message. I hope you have got the message now. Deciphering it is not exactly rocket science. My explanation is simple and straightforward, as it is lucid and clear. Only a narrow-minded, short-sighted and paper-thin-brained person would have difficulty in understanding it.<br>" +
                    "<br>" +
                    "To be fair with you and your master, I hereby confirm having read the section of your book in which you have indicated that Jammeh refused to execute you as advised by Captain Valentine Strasser, former junta leader of Sierra Leone. I commend Jammeh for this. I also laud him for not executing other captives as Strasser did. Strasser executed over 30 people, including Colonel Yahya Kano who had been very instrumental in his coup. Although Jammeh didn’t execute detainees soon after his coup as Strasser did, many soldiers have been executed under his watch, accused of plotting to overthrow him. In addition, a cabinet minister and a journalist have been killed under mysterious circumstances during his reign, with the culprits still remaining at large. Additionally, 14 youths (most of them students) and 54 foreign nationals (most of them Ghanaians) have allegedly been massacred under his instruction in April 2000 and July 2005 respectively. Hence, Jammeh and Strasser are tarred with the same brush of brutality. Mr Sarr, Jammeh’s refusal to go by the recommendation of Strasser cannot be used to exculpate or exonerate him as you are trying to do by mentioning it in your rebuttal, blaming me for ignoring it. Crimes are crimes, irrespective of when they are committed.<br>" +
                    "<br>" +
                    "You have, in your usual campaign of mystifying your master, given us a brief history of Kanilai as a village associated with traditional medicine, citing the healing of fracture as an example. You have mentioned the famous Jejaw Jammeh, associating him with your master as his grandfather. As far as I know, there are two Jammeh familes in Kanilai- that of Jejaw and another one. According to sources, Yahya Jammeh doesn’t belong to the family of Jejaw as you have claimed, but belongs to the other Jammeh family. Anyway, I stand to be corrected. You can do your own research and share your findings with the general public. Many people believe that Yahya Jammeh is trying to steal the show- to borrow the expression of one of his former sycophants- with a view to mystifying himself. In other words, Yahya Jammeh pretends to be a descendant of Jejaw in order to give the impression that he has inherited knowledge of traditional medicine. Even if Jammeh’s claim- which you and many other sycophants defend fervently- is true, it should be noted that Kanilai is not the only place in The Gambia with knowledge of traditional medicine. There are many other places, which you have overlooked or chosen to leave out. Fajikunda and Bakindik (Niumi) are examples of such places. They are well known for healing fracture, just like Kanilai. There are other places specializing in the healing of mental illness and many other ailments. As you can see, Mr Sarr, many Gambians belong to families that have knowledge of traditional medicine, and none of them uses that to mystify himself/herself as Jammeh does. The fact that Jammeh has claimed to have answers to all ailments makes his self-mystification worrying, and his quackery and charlatanism need to be checked before it is too late. The irony is that Jammeh doesn’t cure himself and his family members but prefers going and sending his family to the West- his “enemies”- for treatment as I always point out.<br>" +
                    "<br>" +
                    "Your newly coined term “security genius” doesn’t befit your master as you want to make us believe, and you know that fully well. You have coined it merely to sing his praises as usual. Just as you have told us in your book, Jammeh relies heavily on mysticism as a security measure. If Jammeh was a security genius, he would be able to avoid the killing of 14 youths and the massacre of 54 foreign nations mistaken for mercenaries, which I mentioned earlier. How can we regard Jammeh as a security genius with these serious security lapses? Calling Jammeh a security genius is tantamount to saying that those killings were deliberate. Is that what you are telling us?<br>" +
                    "<br>" +
                    "I cannot, in anyway, accept your advice to abandon my Imam whom you have described as an eminent loser and join your part- APRC. That is out of the question. I share principles with my Imam, just as you share characteristics with your master. Like my Imam, I prefer to die with dignity as a loser to living on lies and leading a luxurious, flamboyant lifestyle. Your master has certified you as a pathological liar, and you have confessed to being so. That your master hired you as a diplomat after this certification speaks volumes of his character. Birds of the same feathers flock together. Adhere to your beliefs as an apologist of your master and his party, and allow me to stick with my Imam. May Allah guide and protect my venerable Imam and mentor, Sheikh Oustass Alhaji Baba Mukhtarr Leigh Waliyu-llah Daa’ya-llah! Amen! <br>" +
                    "<br>" +
                    "Thank you for informing me of the imminent publication of a propaganda book. I am eagerly waiting to lay hands on a copy of it. With the publication of that book, I hope your master will certify you as a fully-fletched spin doctor as he has certified you as a pathological liar. I know I am advertising the book for you by mentioning it but I am not the least perturbed.  No sober, sensible person will take you seriously or buy the ideas you are selling in the book. You are nothing but a poacher turned gamekeeper trying to repair the irreparable damage you and your master have done to his image. Undoubtedly, your propaganda will be an exercise in futility, as no right-thinking person can be swayed or convinced by a compulsive liar. Mark my words! Your project has failed before even kicking off. I now refer you and your master to President Obama’s saying “You can jail your opponents but you cannot imprison ideas. You can try to control access to information but you cannot turn a lie into truth.”<br>" +
                    "<br>" +
                    "Your assertion that your master will be re-elected massively in the 2016 presidential election due to popularity is nothing but a bluff. You and your master are not speaking the same language on this subject. If he was sure of a landslide victory as you have claimed, he would not bother to change the electoral laws to make it harder for his opponents to contest. Besides, he would not insist on illegally maintaining in office the current chairman of the IEC who many people see as his stooge, despite the thunderous, reverberating clamour of the opposition to replacement him as dictated by the laws of the Land. Your master has amply demonstrated that he is in a state of paranoia. If you really believe that he is popular and can win the election easily, advise him to organize an indisputably free and fair election by providing a level playing field and playing by the rules of the game.   <br>" +
                    "  <br>" +
                    "Mr Sarr, I am not a prophet of doom as you have characterized me in your last rebuttal, and I don’t bear malice or grudge against you or anyone else. God forbid! I would not rejoice over your misfortune as you believe, for I don’t expect and cannot reap any benefit from it. Thus, I am disappointed that you have misconstrued my views and those of other critics of your master regarding your reconciliation with him. I expected you to take my remarks as advice or warning rather than interpreting them as hatred. Your master has used and dumped so many people, including soldiers, ministers, civil servants, religious leaders, business men and investors in general (local and foreign). He is notorious for breach of contract, incurring law suits and heavy fines to his government. He has liquidated all the junta members and many other soldiers who staged his coup d’état with him. He has incarcerated his allies and seized properties of investors after falling apart with them. I hope you would not dare tell us that all those people are at fault. Mr Sarr, there is nothing special in you to make you believe that you are secure and that what has happened to the former associates of your master- numerous as they are- cannot happen to you. This brings me to the aforementioned theory, which I will explain using a mathematical operation called exponentiation, though I don’t claim to be a mathematician. Owing to his erratic behaviour, many people- myself included- have said that Yahya Jammeh is unpredictable. People see him as a puzzle/riddle that is extremely difficult to unravel or solve. In other words, people find it too hard to understand and predict Jammeh. However, there is an inherent characteristic that can help in this regard; that is his tendency to betray and bully people. It is as easy as winking to predict that Jammeh will betray or bully a person. Even a child can predict that and get it right.  I call this tendency of betraying and bullying the two Bs or B2 (B squared). Betraying a person and bullying him can metaphorically be called adding insult to injury (injuring a person and insulting him instead of saying “sorry” to him/her). Thus, we get I2 (I squared).  Considering the matter literally and metaphorically leads us to B2/I2. Adding the mathematical symbol “=” will give us B2/I2=. If we add J (standing for Jammeh), we get the formula B2/I2=J. We can simplify the formula by reducing it to B2=J. This unravels the puzzle (Jammeh). Simply put, it defines Jammeh. The formula denotes that Jammeh is a betrayer and a bully. Hence, I call Jammeh B Squared. The theory is called Gaye’s Theory of Unravelling Jammeh (GTUJ). I invite you Samsudeen Sarr the giant writer and spin doctor to review it and consider it for adoption when you fall from grace with your master Jammeh. On a final note, I advise those dealing or interacting with Jammeh to always bear in mind that he can betray and bully them anytime. Woe betide them if they fail to pay heed to this advice! </font>   <br>"
            ,
            "<font color=\"black\"><b>Welcome Sall, Goodbye Wade!</b><br>" +
                    "<br>" +
                    "Like I did in an article published in the Daily Observer newspaper of The Gambia immediately after the election of Abdoulaye Wade in 2000, I want to spare a moment to expatiate on the 2012 presidential election. <br>" +
                    "<br>" +
                    "First and foremost, I would like to welcome the newly elected president of Senegal, His Excellency, Macky Sall and congratulate him for a well-deserved, landslide victory. Although I have confidence in Macky, I urge him to endeavour to live up to expectations by delivering the goods well. May Allah the Almighty guide him on the right path and protect him. As for his rival and former godfather, Abdoulaye Wade, I bid him adieu and exhort him to accept God’s decision in good faith, bearing in mind that no condition is permanent.  <br>" +
                    "<br>" +
                    "Sall’s Determination<br>" +
                    "Macky Sall’s determination lends credence to the saying “Where there is a will there is a way”. After he was dismissed as Prime Minister and later ejected from the Senegalese parliament where he served as Speaker, he made up his mind to have it his own way and hence fought tooth and nail. He formed a party promptly and started campaigning for the presidential election. Macky’s removal from the Senegalese parliament was judged unfair by many. It therefore earned him the sympathy and support of Senegalese within and outside Senegal, which shot him to prominence after a short while.  <br>" +
                    "<br>" +
                    "Wade’s Behaviour <br>" +
                    "Abdoulaye Wade did a very good thing by calling Macky Sall to concede defeat and congratulate him about half way through the counting of votes, as this defused the political tension and gave the Senegalese and their well-wishers a sigh of relief. However, his behaviour leaves much to be desired. He was involved in gimmicks which yielded no dividends. He tried at all cost to manoeuvre his way but to no avail.  <br>" +
                    "<br>" +
                    "Wade was suspected of grooming his son Karim to succeed him, which made many Senegalese angry with him. He appointed him state minister and assigned him to run a key ministry with four important departments attached to it- the first of such appointment to such an important portfolio in the history of Senegal. Besides, he vested him with a lot of powers and used to praise him highly while accusing and castigating his former protégés Mack Sall and Idrisa Seck after sacking them and expelling them from his party. It is worth noting that these two former prime ministers where regarded as possible successors of Abdoulaye Wade as party leader or president of Senegal. Hence, the widely held belief among Senegalese that Wade elbowed them out to pave the way for his son Karim holds water.<br>" +
                    "<br>" +
                    "Wade’s dogged decision to contest in the 2012 presidential election after saying publicly and unequivocally that he was barred by the Senegalese constitution and expressing his “unwillingness” to do so, is one of the numerous factors that militated against him. This unpopular decision led to protests which, in turn, gave rise to many deaths and serious injuries in addition to destruction of valuable properties. In stead of apologizing to the Senegalese people or sympathizing with them, he attempted to trivialize the incidents by qualifying them as “small wind” to the astonishment and utter disgust of many.   <br>" +
                    "<br>" +
                    "After the first round of voting, Wade and his supporters censured Macky Sall for addressing Fula communities in the Fula language, branding him as an ethnocentric politician and accused Fulas in northern Senegal and some suburbs of Dakar of voting along ethnic/tribal lines in favour of Macky who is a Fula. Wade even went to the extent of threatening not to do any more work for Fula communities in Matam and Podor should they vote for Macky in the second round. This manoeuvre was condemned by many who viewed it as a desperate and dangerous way of trying to dissuade Macky’s voters. They argued convincingly that ethnic/tribal politics has never been an issue in Senegal and that raising it as an issue could pose a threat to national integration and should be avoided for this reason. They refuted the allegations pointing out that Macky is married to a Serere woman and that some Fula communities in Kolda and northern Senegal voted overwhelmingly for Wade during the first round. Macky contended that it was not wrong for him to address his fellow Fulas in his mother tongue and that Wade was the very one who gave him the microphone and told him to address the Fulas of northern Senegal in Fula when he was serving as his campaign manager during the 2007 presidential election. What a cogent argument!<br>" +
                    "<br>" +
                    "Wade spent an astronomical amount of money in his campaign. It is reported that he blew more that 60 percent of the State House budget to buy votes between the two rounds of voting. He bribed religious leaders with colossal sums of money to have them publicly declare their support for him and instruct their followers to vote for him massively. Some complied fully and went the extra mile of predicting a landslide victory for him. There were reports of people queuing up at the State House till 03:00 to receive money, during which time they exchanged blows in the queue. Wade sent an envoy to The Gambia with about D900,000 to dish out. The envoy was reportedly assaulted physically by a group of Senegalese youths after he quarrelled bitterly with the Senegalese High Commissioner to The Gambia over the money. It was also reported on the day of the election that some Wade supporters carried huge sums of money which they used to buy votes at a polling station.   <br>" +
                    "<br>" +
                    "Among Wade’s desperate moves is the use of a staff (walking stick) which, according to observers, he believed to be associated with magical/mystical powers. Wade was seen brandishing the said staff at his rallies during the last days of the campaign. Other reports have it that Wade ordered fetishists from neighbouring countries with the conviction that they could help to facilitate victory for him using their “magical/mystical powers”. <br>" +
                    "<br>" +
                    "That Wade has woefully failed to achieve his aim after employing various tactics and resorting to the use of “magical/mystical” means is a clear testimony to the fact that nothing can stop people if they are determined to change a government. The Senegalese people have amply demonstrated political maturity/awareness once again. As Macky rightly said in his first press conference after the election, it is the Senegalese who have truly won, not him. Like the lioness Fatou Jaw-Manneh has aptly put it in her wonderfully crafted poem “Senegal you make us proud”, the election results are incontrovertibly a source of pride. I hope African countries that are submissive to dictators will see reason and borrow a leaf from Senegal. Bravo Senegal! Long live Senegal! </font> <br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>What a damnable Act!</b><br>" +
                    "<br>" +
                    "People were thunderstruck, nauseated and disgusted by the recent unsavoury manoeuvre of the Gambian authorities which took the form of a TV interview of family members of Pa Nderry Mbai, the proprietor and Managing Editor/Publisher of Freedom Newspaper and Freedom Radio who is currently residing in the US. The interviewees, including the old father of the journalist, spoke ill of their loved one- Pa Nderry- while praising the Gambian leader, Yahya Jammeh and his government under duress. What a pity! Observers have advanced many theories in their attempt to puzzle out this reprehensible, inconceivable and seemingly-unfathomable act, chief among which are the ones discussed below:<br>" +
                    "<br>" +
                    "The Image-making Theory<br>" +
                    "Many are those who believe that the authorities made the move with the aim of portraying Jammeh as a generous, pious leader. According to this theory, the authorities were trying to convey the message that Jammeh is so benevolent that he helps the family members of his critics and that he does this in the cause of God. This theory is supported by the question posed to Pa Nderry’s mother by the interviewer- a GRTS journalist: “Who sent you to Mecca?” As expected, the lady responded thus: “AlhajieYahya Jammeh.” Although the idea of parading Pa Nderry’s family members on the TV is stupefying, the above question is not the least surprising because we have been told on numerous occasions by Jammeh’s sycophants and praise-singers that he sponsored the trip of Pa Nderry’s mother to Mecca. Even GRTS journalists said explicitly in the interview that Jammeh had given a Hajj (pilgrimage) package to the lady out of benevolence despite Pa Nderry’s smear campaign against his regime. Hence, the message is crystal clear.<br>" +
                    "<br>" +
                    "Regarding the aforementioned Hajj package, I rule out benevolence and piety. I have the conviction that the motive behind it is image-making or propaganda as observers have noted, and that it is not a gesture of goodwill made in the cause of God as claimed by Jammeh’s supporters. Otherwise, there wouldn’t be any need to publicize it. A pertinent question asked by many is: “Where does the money for Jammeh’s Hajj packages come from?” Some people speculate that it is from the government of Saudi Arabia, and others claim that it is from the Gambia Government coffers. To say that the money is from Jammeh’s pockets would worsen matters for him, as it would mean the source is illegal, or it is dirty money, bluntly put. It is worth mentioning at this juncture that publicizing the sponsorship of the lady’s pilgrimage by Jammeh is improper and abhorrent from the Islamic perspective. According to our venerable prophet (peace be upon him), we should not allow our left hands to know what the right hands are doing when giving out charity. The interpretation of this Islamic principle is that acts of charity or deeds in the cause of God in general need not and should not be publicized. To recapitulate, I say loudly and clearly that the deafening, ear-splitting noise on the Hajj package of Pa Nderry’s mother emanating from Jammeh’s camp is utterly un-Islamic and uncalled for. <br>" +
                    "<br>" +
                    "The Smear Campaign Theory<br>" +
                    "There are observers who believe that the authorities are set out to tarnish the image of Pa Nderry Mbai or discredit him by having his own family members vilify him publicly. Based on the question as to whether the family has contact with Pa Nderry thrown by the GRTS journalist, one can conclude that this theory tends to hold water. The question was answered in the negative, with Pa Nderry’s younger brother elaborating by saying that he doesn’t even have Pa Nderry’s telephone number; that Pa Nderry doesn’t assist the family at all and that he would try to sway him and turn him to a fervent supporter of Jammeh and his government if he had access to him. Obviously, the answer could only be “no”, for an answer in the affirmative might be interpreted thus by the authorities:  Since you are in touch with your close relative Pa Nderry who continues to fight Jammeh’s government, you approve of his acts because you don’t try to stop him. Therefore, you are an accomplice and as such guilty of undermining the government. So, it is not a surprise that the answer came in the negative. Maybe the tactic employed by the respondents in their responses is this: Tell the authorities what they want to hear in order to have peace. I guess many people would do the same thing if they were in their position.  <br>" +
                    "<br>" +
                    "With the negative responses furnished by the interviewees, the authorities intend to relay the message that Pa Nderry has no sense of responsibility towards his family members as he has deserted or neglected them and that he is not a credible or thrust-worthy person. The fact that Pa Nderry has announced his plan to release a book critical of Jammeh and his regime in the near future lends credence to the theory under discussion. Maybe the authorities want to portray him as bad guy or put his credibility into disrepute as a way of preventing people from believing what he has said in the book. <br>" +
                    "<br>" +
                    "Whatever the case may be, the fact remains that Pa Nderry has proven to be a thorn in the flesh of the Gambian authorities, contrary to the assertion of Jammeh’s deputy, Isatou Njie during his prank interview with Pa Nderry that they have no time for him as they are busy with their work and that no one listens to him. The authorities have implicitly confessed through their manoeuvre that Pa Nderry is a strong force to reckon with. Their move has deceived its purpose, for it has portrayed Pa Nderry as an international hero and made people more curious to know about him and his media house. Hence, the authorities have unknowingly launched a publicity campaign for him free of charge, just as they did with the hacking of the Freedom Newspaper website and the publication of the names and contact details of subscribers who were branded informants of Pa Nderry, followed by arrests, detention and torture by the Gambian authorities back in 2006. Somebody told me his mother who is old and not keenly interested in politics and current affairs asked him about Pa Nderry after watching the interview, saying that she was not deceived by the smear campaign. Many people have written to or called Pa Nderry to express solidarity with him without being mobilized like those who expressed solidarity with Jammeh over the execution of death row inmates.   <br>" +
                    "<br>" +
                    "The Tit for Tat Theory<br>" +
                    "The fact that the interview of Pa Nderry’s family by the authorities took place after he aired and published the transcription of the prank interview he had with Isatou Njie during her sojourn in New York on an official mission leads many to believe that the move of the authorities is a form of retributive justice or reciprocal retaliation. The point these people are trying to drive home is simply that the authorities wanted to embarrass Pa Nderry in the same way he had embarrass Jammeh’s deputy- through interview.    <br>" +
                    "<br>" +
                    "The question arises now: Who is to blame in the case of the prank interview? To me, the blame lies squarely on the feet of Isatou Njie in particular and the Gambian authorities as a whole. Given her high position and status, Isatou should have been more cautious or prudent when Pa Nderry called her rather than talking freely on state and personal matters without verifying the identity of the caller. Even if she knew the caller very well, she should have avoided such a carefree behaviour.  Ironically, Isatou Njie who has proven to be too security-unconscious doubles as the Chairperson of Jammeh’s Security Council. It could be argued that the sheer reluctance of the authorities to talk to the press prompted Pa Nderry to penetrate Isatou’s network by disguising as a supporter of Jammeh to have a prank interview with her, as he knew she wouldn’t talk at all if he revealed his true identity. I am not- in any way- suggesting that the authorities should be open to the press to the extent of discussing what they refer to as “state secrets”. What I am saying is that they should be willing to clarify matters of national interest to the press for the sake of transparency instead of remaining taciturn on all matters or using the term “state secret” as a cover-up. If they continue to behave in such a manner, they should not blame journalists for devising their methods of digging out information of public interest from them.<br>" +
                    "<br>" +
                    "The Deterrence Theory<br>" +
                    "Some people are of the view that the move is aimed at muzzling Pa Nderry and journalists and writers of his ilk. To them, the authorities are sending the message that family members of arch-critics of the regime can anytime be subjected to humiliation or harassment by being paraded on the national TV against their will. This, they contend, the authorities believe can force the family members of such crusaders to appeal to their loved ones to desist from fighting the regime, or the fighters themselves to give up the fight so as to save the members of their families from the mortification they may suffer at the hands of the authorities as a result of their rebellious behaviour or revolutionary activities.   <br>" +
                    "<br>" +
                    "This ploy is unjust, uncivilised and unwise. Only an oppressive, repressive regime composed of bullies would employ it, not a regime that claims to be responsible one whose actions are guided by justice and fair play. Such a tactic can be interpreted as punishing people for the alleged or perceived crime of their loved ones, which is utterly unfair and unacceptable. Besides, it is not advisable for the authorities of a country who have a sizable number of the members of their families living abroad to behave in this manner. <br>" +
                    "<br>" +
                    "As can be seen from the foregoing analysis, all the above theories sound plausible. That is to say that the manoeuvre of the authorities is meant to serve as a multipurpose tool of propaganda, defamation, revenge, intimidation, suppression, subjugation and the like, with the ultimate objective of perpetuation in power. However, it is evident that the move is ill-conceived and irrational. Its harms to the authorities outweigh its benefits by far, if at all it can benefit them in any way.  <br>" +
                    "<br>" +
                    "My message to the authorities is that any effort made to gag journalists and writers will go in vain. That these people remain undaunted and imperturbable despite the killing of their colleagues and the agonizing, excruciating persecution to which they are subjected is a clear testimony to this fact. Put in crude terms, attempting to silence all journalists and writers or critics in general is an elusive goal. It is easier for the authorities to change their attitude for the better than to misbehave and expect journalists and writers to be silent over their misdeeds. Believing the contrary is foolhardy and folly. I therefore exhort the authorities to put on their thinking caps or mull over the matter.  <br>" +
                    "<br>" +
                    "In conclusion, I vigorously denounce the deplorable act of the Gambian authorities which I believe is engendered by despair and despondency. I vociferate that it is immature, senseless, ignoble, shameful, sinful, discourteous, opprobrious, outrageous, vexatious and provocative.  </font><br>"

    };
}
