<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  </head>
  <body>
    <article id="2ab5210b-33a1-4dd7-9ebf-3f6563c195e7" class="page sans">
      <header>
     <!--   <img class="page-cover-image" src="https://media.licdn.com/dms/image/D4E12AQFxKXNKRX-MKg/article-cover_image-shrink_720_1280/0/1678832993872?e=2147483647&amp;v=beta&amp;t=BPFVWnyoNd8E83B9hSMLUzwLp_JlFLxogzRYoG2xD1k" style="object-position:center 0%" />
        <div class="page-header-icon page-header-icon-with-cover">
          <span class="icon">👩‍💻</span>  -->
        </div>
        <h1 class="page-title">Rapport du Projet de Compilation </h1>
        <p class="page-description"></p>
      </header>
      <div class="page-body">
        <p id="dd6d0b79-ff71-40be-8eef-940a01d3a9cc" class="">
          <strong>Ce travail est élaboré par </strong>: <em> Kamoun Sabrine &amp; Dridi Maissa &amp; BenYounes Maryem</em>
        </p>
        <p id="f27d848f-ab4e-425d-9059-5912c05d8981" class="">
          <em></em>
        </p>
        <figure class="block-color-gray_background callout" style="white-space:pre-wrap;display:flex" id="91c37de3-cf52-4da8-bd11-75964605e1f5">
          <div style="font-size:1.5em">
            <span class="icon">🔎</span>
          </div>
          <div style="width:100%">On a opté cette grammaire G ci-dessous: <p id="07495f73-93c9-49c4-a284-56b02c55a7a4" class="">P → P S | <strong>ε</strong>
              <br />S → id = E ; | if ( C ) S else S <br />S → while ( C ) S <br />E → E + T | T <br />T → T * F | F <br />F → ( E ) | id | N <br />N → N D | D <br />D → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 <br />DC → E R EQ <br />R → == | != | &lt; | ≤ | &gt; | ≥ <br />
              <br />
            </p>
          </div>
        </figure>
        <p id="d12fcca0-f337-4d4d-bcdf-f4b4548bd572" class=""></p>
        <h1 id="90d1a4b0-3441-479e-879d-91bd5e2456af" class="">1. Analyse Descendant LL(1):</h1>
        <h2 id="36ec8e90-a240-47c8-b1be-4c1f79abb090" class="">1.1) Elimination de récursivité:</h2>
        <figure class="block-color-gray_background callout" style="white-space:pre-wrap;display:flex" id="c830583a-976a-4d44-ba5a-4e3cecfefe5c">
          <div style="font-size:1.5em">
            <span class="icon">🔎</span>
          </div>
          <div style="width:100%">Grammaire non récursive G’: <p id="c125d042-4b21-40d1-8b7a-721342123603" class="">P → P&#x27; <br />P&#x27; → S P&#x27; | ε <br />S → id = E ; | if ( C ) S else S <br />S → while ( C ) S <br />E → T E&#x27; <br />E&#x27; → + T E&#x27; | ε <br />T → F T&#x27; <br />T&#x27; → * F T&#x27; | ε <br />F → ( E ) | id | N <br />N → D N&#x27; <br />N&#x27; → D N&#x27;| ε <br />D → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 <br />DC → E R EQ <br />R → == | != | &lt; | ≤ | &gt; | ≥ <br />
            </p>
          </div>
        </figure>
        <h2 id="df125f6a-9b3d-4c59-8856-bf3b64a25437" class="">1.2) Elimination de l’ambiguïté:</h2>
        <p id="0efc2868-830c-45f2-bd9b-94e43c9a5b13" class=""></p>
        <figure class="block-color-gray_background callout" style="white-space:pre-wrap;display:flex" id="765b6e81-0014-448e-ab10-155d6bb1128b">
          <div style="font-size:1.5em">
            <span class="icon">🔎</span>
          </div>
          <div style="width:100%">Même grammaire G’ (pas d’ambiguïté) <p id="335814d3-de5d-4df2-8c19-f2a06bc2ef24" class="">P → P&#x27; <br />P&#x27; → S P&#x27; | ε <br />S → id = E ; | if ( C ) S else S <br />S → while ( C ) S <br />E → T E&#x27; <br />E&#x27; → + T E&#x27; | ε <br />T → F T&#x27; <br />T&#x27; → * F T&#x27; | ε <br />F → ( E ) | id | N <br />N → D N&#x27; <br />N&#x27; → D N&#x27; | ε <br />D → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 <br />DC → E R E <br />
            </p>
            <p id="bbaeca70-725c-410f-8919-ac36a2ff48b4" class="">R → == | != | &lt; | ≤ | &gt; | ≥</p>
          </div>
        </figure>
        <h2 id="a47d3b4e-743b-47bb-a941-62a26d88722a" class="">1.3) Premiers &amp; Suivants:</h2>
        <h3 id="efdebeda-59fe-4f1d-bced-302bfe9882b1" class="">1.3.1) Premiers:</h3>
        <p id="9378060e-22e6-406a-9397-d7a42263757c" class="">Suivant(P)={ε,id,if,while}</p>
        <p id="a18ca754-cd95-47b5-a46f-359cea860821" class="">Suivant(P’)={ε,id,if,while} <br />Suivant(S)={id,if,while} <br />
        </p>
        <p id="d6515654-a7fd-4319-a216-cd5d7625cda7" class="">Suivant(E)={(,id,0,1,2,3,4,5,6,7,8,9}</p>
        <p id="443bd8b6-ce51-4641-9284-78bdf87fea96" class="">Suivant(E’)={+,ε}</p>
        <p id="5b91486a-cb05-4501-8eea-45d13b9f4525" class="">Suivant(T)={(,id,0,1,2,3,4,5,6,7,8,9</p>
        <p id="52d9ff8a-328f-4420-b139-85801322dbe7" class="">Suivant(T’)={*,ε} <em>
            <br />
            <br />
          </em>Suivant(F)={(,id,0,1,2,3,4,5,6,7,8,9} </p>
        <p id="06099d12-47fa-4bb1-b93e-59716d51e3e2" class="">Suivant(N)={0,1,2,3,4,5,6,7,8,9}</p>
        <p id="75aa0347-6cfd-4cc3-819f-6cb19bbafbb2" class="">Suivant(N’)={ε,0,1,2,3,4,5,6,7,8,9}</p>
        <p id="908f0ebc-337d-4f52-915a-d5b7d197cda8" class="">Suivant(D)={0,1,2,3,4,5,6,7,8,9}</p>
        <p id="e1db8a93-db0f-4edd-8d1e-4a780a412458" class="">Suivant(C)={(,id,0,1,2,3,4,5,6,7,8,9} <br />Suivant(R)={==,!=,&lt;,&lt;=,&gt;,&gt;=} <br />
        </p>
        <p id="0cc38bcf-f8d6-4b51-8a41-b31d85f74016" class=""></p>
        <h3 id="acaf5827-471e-44f3-9e84-ac16bf898861" class="">1.3.2) Suivants:</h3>
        <p id="6b733339-21b7-449b-aabc-affe18502e99" class="">Suivant(P)={$}</p>
        <p id="23fe2b1d-3824-4c83-b19c-a630ab9dfc1c" class="">Suivant(P’)={$} <br />Suivant(S)={$,id,if,while,else} <br />
        </p>
        <p id="8426ade1-12d7-4457-b830-c469c7c23004" class="">Suivant(E)={;,),==,!=,&lt;,&lt;=,&gt;,&gt;=}</p>
        <p id="bf12ee6e-f877-4e21-957b-0f1ca8731b9a" class="">Suivant(E’)={;,),==,!=,&lt;,&lt;=,&gt;,&gt;=} <br />Suivant(T)={+,;,),==,!=,&lt;,&lt;=,&gt;,&gt;=} <br />
        </p>
        <p id="7717ce64-b7bc-43dd-a477-b83502a8d88d" class="">Suivant(T’)={+,;,),==,!=,&lt;,&lt;=,&gt;,&gt;=} <em>
            <br />
            <br />
          </em>Suivant(F)={*,+,;,),==,!=,&lt;,&lt;=,&gt;,&gt;=} </p>
        <p id="7d037b34-90b5-4641-a7b2-58cee98bded4" class="">Suivant(N)={*,+,;,),==,!=,&lt;,&lt;=,&gt;,&gt;=}</p>
        <p id="5a0e2733-c8fe-4e80-88c8-10d3af4e1bc9" class="">Suivant(N’)={*,+,;,),==,!=,&lt;,&lt;=,&gt;,&gt;=}</p>
        <p id="c0372fdb-6c9c-46cd-bd33-99f00a7a6cd4" class="">Suivant(D)={*,+,;,0,1,2,3,4,5,6,7,8,9,),==,!=,&lt;,&lt;=,&gt;,&gt;=} <br />Suivant(C)={)} <br />Suivant(R)={(,id,0,1,2,3,4,5,6,7,8,9} <br />
        </p>
        <h2 id="6df77538-7fc7-45c4-a7ae-4c7f0f5debda" class="">1.4) Table LL1:</h2>
        <figure id="e9f01f2b-9788-41dc-b456-2c7d9bb68c8c">
          <div class="source">
 <table>
      <thead>
        <tr id="llTableHead">
          <th>Nonterminal</th>
          <th>id</th>
          <th>=</th>
          <th>;</th>
          <th>if</th>
          <th>(</th>
          <th>)</th>
          <th>else</th>
          <th>while</th>
          <th>+</th>
          <th>*</th>
          <th>0</th>
          <th>1</th>
          <th>2</th>
          <th>3</th>
          <th>4</th>
          <th>5</th>
          <th>6</th>
          <th>7</th>
          <th>8</th>
          <th>9</th>
          <th>==</th>
          <th>!=</th>
          <th>&lt;</th>
          <th>&lt;=</th>
          <th>&gt;</th>
          <th>&gt;=</th>
          <th>$</th>
        </tr>
      </thead>
      <tbody id="llTableRows">
        <tr>
          <td nowrap="nowrap">P</td>
          <td nowrap="nowrap">P -&gt; P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P -&gt; P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P -&gt; P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P -&gt; P'</td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">P'</td>
          <td nowrap="nowrap">P' -&gt; S P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P' -&gt; S P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P' -&gt; S P'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">P' -&gt; ε</td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">S</td>
          <td nowrap="nowrap">S -&gt; id = E ;</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">S -&gt; if ( C ) S else S</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">S -&gt; while ( C ) S</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">E</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap">E -&gt;T E'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">E'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E' -&gt; + T E'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap">E' -&gt;ε</td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">T</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap">T -&gt; F T'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">T'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt; * F T'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap">T' -&gt;ε</td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">F</td>
          <td nowrap="nowrap">F -&gt; id</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">F -&gt; ( E )</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap">F -&gt; N</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">N</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap">N -&gt; D N'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">N'</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt; D N'</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap">N' -&gt;ε</td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">D</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">D -&gt; 0</td>
          <td nowrap="nowrap">D -&gt; 1</td>
          <td nowrap="nowrap">D -&gt; 2</td>
          <td nowrap="nowrap">D -&gt; 3</td>
          <td nowrap="nowrap">D -&gt; 4</td>
          <td nowrap="nowrap">D -&gt; 5</td>
          <td nowrap="nowrap">D -&gt; 6</td>
          <td nowrap="nowrap">D -&gt; 7</td>
          <td nowrap="nowrap">D -&gt; 8</td>
          <td nowrap="nowrap">D -&gt; 9</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">C</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap">C -&gt; E R E</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
        </tr>
        <tr></tr>
        <tr>
          <td nowrap="nowrap">R</td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap"></td>
          <td nowrap="nowrap">R -&gt; ==</td>
          <td nowrap="nowrap">R -&gt; !=</td>
          <td nowrap="nowrap">R -&gt; &lt;</td>
          <td nowrap="nowrap">R -&gt; &lt;=</td>
          <td nowrap="nowrap">R -&gt; &gt;</td>
          <td nowrap="nowrap">R -&gt; &gt;=</td>
          <td nowrap="nowrap"></td>
        </tr>
      </tbody>
    </table>          </div>
        </figure>
        <h1 id="7b68ca9a-6362-46a8-9fdc-c63a95be976c" class="">2.Analyse Ascendant SLR:</h1>
        <h2 id="c708a7be-b04b-4aa4-8375-23dfa1e9e567" class="">2.1) Premiers &amp; Suivants:</h2>
        <h3 id="25bdf440-df02-42f7-acfc-b4c7ac9131ef" class=""> 2.1.1) Premiers:</h3>
        <p id="d1e3494e-0169-483b-9420-d654aab15c8e" class=""> Premier(P)={ <strong>ε</strong>,id,if,while} <br /> Premier(S)={id,if,while} <br /> Premier(E)={(,id,0,1,2,3,4,5,6,7,8,9} <br /> Premier(T)={(,id,0,1,2,3,4,5,6,7,8,9} <br /> Premier(F)={(,id,0,1,2,3,4,5,6,7,8,9} <br /> Premier(N)={0,1,2,3,4,5,6,7,8,9} <br /> Premier(D)={0,1,2,3,4,5,6,7,8,9} <br /> Premier(C)={(,id,0,1,2,3,4,5,6,7,8,9} <br /> Premier(R)={==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />
        <div class="indented">
          <h3 id="c5ce7bea-8af7-4766-9588-5fc9e6bbcb2b" class="">2.1.2) Suivants:</h3>
          <p id="f69f17ec-53b3-4c98-a5ee-cc836d8bd889" class="">Suivant(P)={$,id,if,while} <br />Suivant(S)={$,id,if,while,else} <br />Suivant(E)={;,+,),==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />Suivant(T)={;,+, <br />
            <em>,),==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />
              <br />
            </em>Suivant(F)={;,+,,),==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />Suivant(N)={;,+,,0,1,2,3,4,5,6,7,8,9,),==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />Suivant(D)={;,+,,0,1,2,3,4,5,6,7,8,9,),==,!=,&lt;=,&gt;,&lt;,&gt;=} <br />Suivant(C)={)} <br />Suivant(R)={(,id,0,1,2,3,4,5,6,7,8,9} <br />
          </p>
        </div>
        </p>
        <p id="8e01faf3-8809-48ad-bd0a-8cee98224dc9" class=""></p>
        <h2 id="7505ba4a-97f5-477d-8ba0-47f0c071c636" class="">2.2) Grammaire augmentée:</h2>
        <figure class="block-color-gray_background callout" style="white-space:pre-wrap;display:flex" id="907e3485-b1d5-49fd-961c-1726bae5bcf2">
          <div style="font-size:1.5em">
            <span class="icon">💡</span>
          </div>
          <div style="width:100%"> ''' P’ → P P → P S | <strong>ε</strong>
            <br />S → id = E ; | if ( C ) S else S <br />S → while ( C ) S <br />E → E + T | T <br />T → T * F | F <br />F → ( E ) | id | N <br />N → N D | D <br />D → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 <br />DC → E R E <br />R → == | != | &lt; | ≤ | &gt; | ≥ ''' <br />
          </div>
        </figure>
        <p id="049fee36-7866-40a6-9b5d-686c84f3507e" class=""></p>
        <h2 id="deff541b-8c43-450f-90ef-6eb9eaca57d1" class="">2.3) Collection des items :</h2>
        <p id="2382909c-e5e9-4988-8405-66f69fa09ea4" class="">I0= <em>fermeture_</em>{ P’ → .P }={P&#x27; -&gt; .P; P -&gt; .P S; P -&gt; .} </p>
        <p id="1e901bc9-039e-4864-aaf4-5f0428d312fb" class="">
          <em>transition</em>(I0,P)={ <mark class="highlight-teal">P&#x27; -&gt; P.</mark>; P -&gt; P.S; S -&gt; .id = E ;; S -&gt; .if ( C ) S else S; S -&gt; .while ( C ) S}= <strong>I1</strong>
        </p>
        <p id="24493c87-7a89-4cbe-91ea-c844df10a014" class="">
          <em>transition</em>(I1,S)= <mark class="highlight-teal">{P -&gt; P S.}= I2</mark>
        </p>
        <p id="7a618167-8574-4c03-8015-ec8620aa12b0" class="">
          <em>transition</em>(I1,id)={S -&gt; id.= E ;}= <strong>I3</strong>
        </p>
        <p id="0e7e18bc-b689-4c67-a593-df401e390851" class="">
          <em>transition</em>(I1,if)={S -&gt; if.( C ) S else S}= <strong>I4</strong>
        </p>
        <p id="1d78c3e0-a00b-41f9-94f2-1eb5d15f0c57" class="">
          <em>transition</em>(I1,while)={S -&gt; while.( C ) S}= <strong>I5</strong>
        </p>
        <p id="b6665e91-1549-42fa-a4f4-ef997fc81830" class="">
          <em>transition</em>(I3,=)={S -&gt; id =.E ;; E -&gt; .E + T; E -&gt; .T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9} =I6
        </p>
        <p id="092e0028-f124-4141-b283-69e76c9da980" class="">
          <em>transition</em>(I4,()={S -&gt; if (.C ) S else S; C -&gt; .E R E; E -&gt; .E + T; E -&gt; .T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I7</strong>
        </p>
        <p id="a95f5581-c036-4a3b-8dcc-b3fc6215e72d" class="">
          <em>transition</em>(I5,()={S -&gt; while (.C ) S; C -&gt; .E R E; E -&gt; .E + T; E -&gt; .T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I8</strong>
        </p>
        <p id="8e85f14e-af34-4b1f-9281-a33a7fbb82e2" class="">
          <em>transition</em>(I6,E)={S -&gt; id = E.;; E -&gt; E.+ T}= <strong>I9</strong>
        </p>
        <p id="49682e5a-249c-4807-90b7-d565467e963d" class="">
          <em>transition</em>(I6,T)= <mark class="highlight-teal">{E -&gt; T</mark>.; T -&gt; T.* F}= <strong>I10</strong>
        </p>
        <p id="908291ee-1aca-4d3f-aef5-ba4fa151f4fd" class="">
          <em>transition</em>(I6,F)= <mark class="highlight-teal">{T -&gt; F.}=</mark>
          <strong>
            <mark class="highlight-teal">I11</mark>
          </strong>
        </p>
        <p id="da641a8e-bc03-4687-aa7c-b02f2d958483" class="">
          <em>transition</em>(I6,()={F -&gt; (.E ); E -&gt; .E + T; E -&gt; .T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I12</strong>
        </p>
        <p id="359b0e54-8d4d-4f80-b6bd-986e2ccf7005" class="">
          <em>transition</em>(I6,id)= <mark class="highlight-teal">{F -&gt; id.}=</mark>
          <mark class="highlight-teal">
            <strong>I13</strong>
          </mark>
        </p>
        <p id="dd2492e0-e720-4ff5-a6da-8ddc7942001a" class="">
          <em>transition</em>(I6,N)={ <mark class="highlight-teal">F -&gt; N</mark>.; N -&gt; N.D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}=I14
        </p>
        <p id="8b512082-d16d-4449-b6be-f0e6a32175fb" class="">
          <em>transition</em>(I6,D)= <mark class="highlight-teal">{N -&gt; D.}=</mark>
          <strong>
            <mark class="highlight-teal">I15</mark>
          </strong>
        </p>
        <p id="26e0901f-023e-4624-8af2-6fea26df79f7" class="">
          <em>transition</em>(I6,0)= <mark class="highlight-teal">{D -&gt; 0.}=</mark>
          <strong>
            <mark class="highlight-teal">I16</mark>
          </strong>
        </p>
        <p id="1192468f-4701-45d4-963d-8abaef7dbfa6" class="">
          <em>transition</em>(I6,1)= <mark class="highlight-teal">{D -&gt; 1.}=</mark>
          <strong>
            <mark class="highlight-teal">I17</mark>
          </strong>
        </p>
        <p id="0e5e35aa-7841-4f45-8424-f20218e1bb9a" class="">
          <em>transition</em>(I6,2)= <mark class="highlight-teal">{D -&gt; 2.}=</mark>
          <strong>
            <mark class="highlight-teal">I18</mark>
          </strong>
        </p>
        <p id="839a6dad-b280-4757-bf5c-5b6e77f78dd3" class="">
          <em>transition</em>(I6,3)= <mark class="highlight-teal">{D -&gt; 3.}=</mark>
          <strong>
            <mark class="highlight-teal">I19</mark>
          </strong>
        </p>
        <p id="fb5fa162-aa66-4c28-8047-3c1ea99c19ae" class="">
          <em>transition</em>(I6,4)= <mark class="highlight-teal">{D -&gt; 4.}=</mark>
          <strong>
            <mark class="highlight-teal">I20</mark>
          </strong>
        </p>
        <p id="43bc0f45-e93b-4bd2-8873-74f0350ec64e" class="">
          <em>transition</em>(I6,5)= <mark class="highlight-teal">{D -&gt; 5.}=</mark>
          <strong>
            <mark class="highlight-teal">I21</mark>
          </strong>
        </p>
        <p id="c205f406-e66d-4358-9266-e8a7850a3172" class="">
          <em>transition</em>(I6,6)= <mark class="highlight-teal">{D -&gt; 6.}=</mark>
          <strong>
            <mark class="highlight-teal">I22</mark>
          </strong>
        </p>
        <p id="88103d15-9433-4c69-b54b-5cc61068a28e" class="">
          <em>transition</em>(I6,7)= <mark class="highlight-teal">{D -&gt; 7.}=</mark>
          <strong>
            <mark class="highlight-teal">I23</mark>
          </strong>
        </p>
        <p id="c60a4cdc-3aed-4814-ae0e-57671c7af23c" class="">
          <em>transition</em>(I6,8)= <mark class="highlight-teal">{D -&gt; 8.}=</mark>
          <strong>
            <mark class="highlight-teal">I24</mark>
          </strong>
        </p>
        <p id="9c78922b-401c-414e-b4f7-f0ba825a8f8b" class="">
          <em>transition</em>(I6,5)= <mark class="highlight-teal">{D -&gt; 9.}=</mark>
          <strong>
            <mark class="highlight-teal">I25</mark>
          </strong>
        </p>
        <p id="1a4e00ff-f733-4b9f-888f-0deac883ec44" class="">
          <em>transition</em>(I7, C)={S -&gt; if ( C.) S else S}= <strong>I26</strong>
        </p>
        <p id="30a15b25-32bb-46c0-b761-e99b12213e0e" class="">
          <em>transition</em>(I7, E)={C -&gt; E.R E; E -&gt; E.+ T; R -&gt; .==; R -&gt; .!=; R -&gt; .&lt;; R -&gt; .&lt;=; R -&gt; .&gt;; R -&gt; .&gt;=}= <strong>I27</strong>
        </p>
        <p id="d264257c-45cb-4f3a-ad3f-bfaac4e941d5" class="">
          <em>transition</em>(I7, T)= <strong>I10</strong>
        </p>
        <p id="121b8e6b-da83-4d4c-9f0a-62946082ccb6" class="">
          <em>transition</em>(I7, F)= <strong>I11</strong>
        </p>
        <p id="1b8261d5-6222-42f8-b3b7-301186f195d5" class="">
          <em>transition</em>(I7, ()= <strong>I12</strong>
        </p>
        <p id="f31b2424-c642-4090-bf59-39d443daa707" class="">
          <em>transition(I7, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="53bcca9c-7bef-4b2f-8d9d-c113fe33054e" class="">
          <em>transition</em>(I7, N)= <strong>I14</strong>
        </p>
        <p id="2ea1d7e2-ac61-4917-8cc5-9c3a87dc95e8" class="">
          <em>transition</em>(I7, D) <strong>=I15</strong>
        </p>
        <p id="94393260-f44c-4974-862f-a9313f676807" class="">
          <em>transition</em>(I7,0)= <strong>I16</strong>
        </p>
        <p id="2d1be44b-feed-474d-ac46-7be5721d7e35" class="">
          <em>transition</em>(I7,1)= <strong>I17</strong>
        </p>
        <p id="8649d92b-55a3-4714-bcca-f58e6a7310e4" class="">
          <em>transition</em>(I7,2)= <strong>I18</strong>
        </p>
        <p id="c4d9b6c4-93f1-4439-aa82-fe9f9de612bd" class="">
          <em>transition</em>(I7,3)= <strong>I19</strong>
        </p>
        <p id="1db105bd-8e82-4eb0-a5dc-40e7530ff500" class="">
          <em>transition</em>(I7,4)= <strong>I20</strong>
        </p>
        <p id="a0a5eb21-0f88-4768-8035-39859f6a50e7" class="">
          <em>transition</em>(I7,5)= <strong>I21</strong>
        </p>
        <p id="21667792-9f55-4783-ae16-b6d3c6e92c71" class="">
          <em>transition</em>(I7,6)= <strong>I22</strong>
        </p>
        <p id="138f44dd-09f7-4bb8-a918-a93c65d176d5" class="">
          <em>transition</em>(I7,7)= <strong>I23</strong>
        </p>
        <p id="c6655109-1a74-48e6-903f-a7ac824cce96" class="">
          <em>transition</em>(I7,8)= <strong>I24</strong>
        </p>
        <p id="dcc6f352-70e6-4fc1-9505-e62901bff524" class="">
          <em>transition</em>(I7,9)= <strong>I25</strong>
        </p>
        <p id="9c1bc227-8240-4f25-8bfe-d9abf1ca72ff" class="">
          <em>transition</em>(I8, C)={S -&gt; while ( C.) S}= <strong>I28</strong>
        </p>
        <p id="03df15d8-7074-446b-a292-913502bbd11a" class="">
          <em>transition</em>(I8, E)= <strong>I27</strong>
        </p>
        <p id="95dc8bc3-fab4-4811-9e19-31349aa6a2b8" class="">
          <em>transition</em>(I8, T)= <strong>I10</strong>
        </p>
        <p id="5f2cbccc-65fa-44a0-b69c-9d183350aed5" class="">
          <em>transition</em>(I8, F)= <strong>I11</strong>
        </p>
        <p id="e0ed1739-c32d-47cb-aa8e-19d207dd7a04" class="">
          <em>transition</em>(I8, ()= <strong>I12</strong>
        </p>
        <p id="9fd39518-04c3-4d16-bd82-beaba42a78fc" class="">
          <em>transition(I8, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="eca9c549-2660-4db0-99af-78a47112d46b" class="">
          <em>transition</em>(I8, N)= <strong>I14</strong>
        </p>
        <p id="b3136a9c-8aa4-4a68-b5f3-0c19644ca2eb" class="">
          <em>transition</em>(I8, D) <strong>=I15</strong>
        </p>
        <p id="b183c32f-8070-42b0-9e9e-fe8a14f4b9ce" class="">
          <em>transition</em>(I8,0)= <strong>I16</strong>
        </p>
        <p id="5aa5a7cd-1f8d-4aa8-976e-39f55fa4c77d" class="">
          <em>transition</em>(I8,1)= <strong>I17</strong>
        </p>
        <p id="a26347c6-7f47-452d-b79d-ac9ccb7a21b6" class="">
          <em>transition</em>(I8,2)= <strong>I18</strong>
        </p>
        <p id="680b0bb2-b360-4e7d-b5b3-ee8ab730ad92" class="">
          <em>transition</em>(I8,3)= <strong>I19</strong>
        </p>
        <p id="cc441dc1-465b-4731-aa2c-0cae0d206150" class="">
          <em>transition</em>(I8,4)= <strong>I20</strong>
        </p>
        <p id="d456bf6a-b979-4df6-8020-4ec51d9de8d9" class="">
          <em>transition</em>(I8,5)= <strong>I21</strong>
        </p>
        <p id="f9afaf41-3066-4e6a-a1d0-9b1b7ac689a0" class="">
          <em>transition</em>(I8,6)= <strong>I22</strong>
        </p>
        <p id="7f3c7f57-1e63-4bb4-bddb-29ede570af07" class="">
          <em>transition</em>(I8,7)= <strong>I23</strong>
        </p>
        <p id="0994a4ad-e1ba-43dc-94c2-597fd31e782f" class="">
          <em>transition</em>(I8,8)= <strong>I24</strong>
        </p>
        <p id="fa8ed785-bac6-451f-a598-977b4395515f" class="">
          <em>transition</em>(I8,9)= <strong>I25</strong>
        </p>
        <p id="ccdf47ef-9275-457d-9c6b-9c08e63f7b79" class="">
          <em>transition</em>(I9,;)= <mark class="highlight-teal">{S -&gt; id = E ;.}=</mark>
          <strong>
            <mark class="highlight-teal">I29</mark>
          </strong>
        </p>
        <p id="97a22e55-9b70-4e58-a9d2-0ff0b28143c3" class="">
          <em>transition</em>(I9,+)={E -&gt; E +.T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I30</strong>
        </p>
        <p id="5c79c19c-31ec-4c3d-8150-71e3451bdbdf" class="">
          <em>transition</em>(I10,*)={T -&gt; T *.F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I31</strong>
        </p>
        <p id="e38279df-c488-4405-9a5a-809daa890812" class="">
          <em>transition</em>(I12, E)={F -&gt; ( E.); E -&gt; E.+ T}= <strong>I32</strong>
        </p>
        <p id="e24926f2-1538-4875-b79f-f0431762cb34" class="">
          <em>transition</em>(I12, T)= <strong>I10</strong>
        </p>
        <p id="4e8fb11b-8127-4b78-9aac-9797ee9713e2" class="">
          <em>transition</em>(I12, F)= <strong>I11</strong>
        </p>
        <p id="9d48e04b-1932-4576-9b76-72e2006c93b4" class="">
          <em>transition</em>(I12, ()= <strong>I12</strong>
        </p>
        <p id="5d5d218d-0e2c-4721-9343-84da4d055081" class="">
          <em>transition(I12, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="05c6f2a4-b846-415b-9269-b46424cb838e" class="">
          <em>transition</em>(I12, N)= <strong>I14</strong>
        </p>
        <p id="2cacfeac-2016-43c5-afd2-bf41ad9f3ed1" class="">
          <em>transition</em>(I12, D) <strong>=I15</strong>
        </p>
        <p id="19c493b5-ca66-4505-82f4-8c5353ac2361" class="">
          <em>transition</em>(I12,0)= <strong>I16</strong>
        </p>
        <p id="9197d660-22e2-4f30-bffc-abf72c021bee" class="">
          <em>transition</em>(I12,1)= <strong>I17</strong>
        </p>
        <p id="a1c16aff-3948-4eca-ae11-356d2a308b7d" class="">
          <em>transition</em>(I12,2)= <strong>I18</strong>
        </p>
        <p id="874feddf-2789-4fab-9b04-c59d531eb6d8" class="">
          <em>transition</em>(I12,3)= <strong>I19</strong>
        </p>
        <p id="efd4de84-abc4-4cb7-bd1b-1e2a30667bfc" class="">
          <em>transition</em>(I12,4)= <strong>I20</strong>
        </p>
        <p id="d6e25434-37e2-4ab3-98ec-b9959322d597" class="">
          <em>transition</em>(I12,5)= <strong>I21</strong>
        </p>
        <p id="37173b7e-f76f-40ef-abac-c21b4bd81883" class="">
          <em>transition</em>(I12,6)= <strong>I22</strong>
        </p>
        <p id="70638e84-abea-4b12-89bd-1e4d4b0d6a90" class="">
          <em>transition</em>(I12,7)= <strong>I23</strong>
        </p>
        <p id="95a648cd-0e8b-4898-a8cb-92e8eb118e5e" class="">
          <em>transition</em>(I12,8)= <strong>I24</strong>
        </p>
        <p id="bbedef27-5f39-4cef-8081-7d37280341cc" class="">
          <em>transition</em>(I12,9)= <strong>I25</strong>
        </p>
        <p id="0dd88256-96c9-496e-95ef-852b95e4c1a7" class="">
          <em>transition</em>(I14, D)= <mark class="highlight-teal">{N -&gt; N D.}=</mark>
          <mark class="highlight-teal">
            <strong>I33</strong>
          </mark>
        </p>
        <p id="75feadb4-f3ff-4f46-a53c-a14593b31745" class="">
          <em>transition</em>(I14,0)= <strong>I16</strong>
        </p>
        <p id="ed187801-de4e-42d5-a2d9-d6024a469504" class="">
          <em>transition</em>(I14,1)= <strong>I17</strong>
        </p>
        <p id="fbd01c5d-3a96-4afa-866b-8975284b3fec" class="">
          <em>transition</em>(I14,2)= <strong>I18</strong>
        </p>
        <p id="a793911c-5d16-4a67-bb38-5cda53a29371" class="">
          <em>transition</em>(I14,3)= <strong>I19</strong>
        </p>
        <p id="7858f4d7-ff20-42db-86f7-740930e8c42d" class="">
          <em>transition</em>(I14,4)= <strong>I20</strong>
        </p>
        <p id="0ca5ad42-a780-483b-a271-f50ed47e9835" class="">
          <em>transition</em>(I14,5)= <strong>I21</strong>
        </p>
        <p id="0932f77f-9c0f-4bf3-b009-e27bfd4731e7" class="">
          <em>transition</em>(I14,6)= <strong>I22</strong>
        </p>
        <p id="3eeafa9b-4949-4b2a-bcec-36fb72a11778" class="">
          <em>transition</em>(I14,7)= <strong>I23</strong>
        </p>
        <p id="f0f15459-c6fb-411a-95b2-74baf013bee7" class="">
          <em>transition</em>(I14,8)= <strong>I24</strong>
        </p>
        <p id="d6f3e685-cd60-46d2-b1fa-29f578587689" class="">
          <em>transition</em>(I14,9)= <strong>I25</strong>
        </p>
        <p id="7c09fe14-1993-433d-aa71-71ec4c611c49" class="">
          <em>transition</em>(I14,))= <mark class="highlight-teal">{S -&gt; if ( C ).S else S; S -&gt; .id = E ;; S -&gt; .if ( C ) S else S; S -&gt; .while ( C ) S}=</mark>
          <mark class="highlight-teal">
            <strong>I34</strong>
          </mark>
        </p>
        <p id="92b6b6ba-fc47-4295-a96a-db822d0318ce" class="">
          <em>transition</em>(I27,R)={C -&gt; E R.E; E -&gt; .E + T; E -&gt; .T; T -&gt; .T * F; T -&gt; .F; F -&gt; .( E ); F -&gt; .id; F -&gt; .N; N -&gt; .N D; N -&gt; .D; D -&gt; .0; D -&gt; .1; D -&gt; .2; D -&gt; .3; D -&gt; .4; D -&gt; .5; D -&gt; .6; D -&gt; .7; D -&gt; .8; D -&gt; .9}= <strong>I35</strong>
        </p>
        <p id="1ccadf08-95dd-4ad6-80d2-23570b249b4c" class="">
          <em>transition</em>(I27,+)= <strong>I30</strong>
        </p>
        <p id="d5a49474-6ef7-4ba3-a4bb-603c14d1a4e3" class="">
          <em>transition</em>(I27,==)= <mark class="highlight-teal">{R -&gt; ==.}=</mark>
          <strong>
            <mark class="highlight-teal">I36</mark>
          </strong>
        </p>
        <p id="55448d00-b73f-499a-833b-77ca2f4c30c2" class="">
          <em>transition</em>(I27,≠)= <mark class="highlight-teal"> {R -&gt; !=.}=</mark>
          <mark class="highlight-teal">
            <strong>I37</strong>
          </mark>
        </p>
        <p id="f8a48df2-c9ec-421b-a2f8-034164774e72" class="">
          <em>transition</em>(I27,&lt;)= <mark class="highlight-teal">{R -&gt; &lt;.}=</mark>
          <strong>
            <mark class="highlight-teal">I38</mark>
          </strong>
        </p>
        <p id="2b5170be-545b-40a6-b210-206d15718d92" class="">
          <em>transition</em>(I27,≤)= <mark class="highlight-teal">{R -&gt; &lt;=.}=</mark>
          <mark class="highlight-teal">
            <strong>I39</strong>
          </mark>
        </p>
        <p id="12065266-44fd-4e10-851a-5d695e414757" class="">
          <em>transition</em>(I27,&gt;)= <mark class="highlight-teal">{R -&gt; &gt;.}=</mark>
          <mark class="highlight-teal">
            <strong>I40</strong>
          </mark>
        </p>
        <p id="6b24b578-f6d6-491c-97f4-6cf594b50f8d" class="">
          <em>transition</em>(I27,≥)= <mark class="highlight-teal">{R -&gt; &gt;=.}=</mark>
          <mark class="highlight-teal">
            <strong>I41</strong>
          </mark>
        </p>
        <p id="4edd3abe-059a-42b5-b238-511230acd96b" class="">
          <em>transition</em>(I28,))={S -&gt; while ( C ).S; S -&gt; .id = E ;; S -&gt; .if ( C ) S else S; S -&gt; .while ( C ) S}= <strong>I42</strong>
        </p>
        <p id="7fd2abc4-99e9-41e9-9ada-45de4999649d" class="">
          <em>transition</em>(I30, T)= <mark class="highlight-teal">{E -&gt; E + T</mark>.; T -&gt; T.* F}= <strong>I43</strong>
        </p>
        <p id="9e79d4f1-dd87-4b54-927b-d7eac1496b4e" class="">
          <em>transition</em>(I30, F)= <strong>I11</strong>
        </p>
        <p id="f218dc6c-c7bd-4c37-b17d-db8c451a9453" class="">
          <em>transition</em>(I30, ()= <strong>I12</strong>
        </p>
        <p id="ec3e2434-9e02-47b8-aef3-fdeb7d1e82f2" class="">
          <em>transition(I</em>30 <em>, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="4fc8b22a-fb57-487c-9343-447d55f6cf7a" class="">
          <em>transition</em>(I30, N)= <strong>I14</strong>
        </p>
        <p id="3b42a5e6-cecf-489a-9bc0-e61598825e0e" class="">
          <em>transition</em>(I30, D) <strong>=I15</strong>
        </p>
        <p id="5154f3ad-f359-420f-a370-1787b1a71ebc" class="">
          <em>transition</em>(I30,0)= <strong>I16</strong>
        </p>
        <p id="1e81a29f-fe9f-4ec9-855f-2eadde42ad03" class="">
          <em>transition</em>(I30,1)= <strong>I17</strong>
        </p>
        <p id="4af0c0f7-30f3-4bb1-a2de-4eafcd6a70b9" class="">
          <em>transition</em>(I30,2)= <strong>I18</strong>
        </p>
        <p id="db120731-a4c6-4206-bdb2-6fc0a80f6adf" class="">
          <em>transition</em>(I30,3)= <strong>I19</strong>
        </p>
        <p id="14a48b66-0894-441f-a17e-a8690c465cfc" class="">
          <em>transition</em>(I30,4)= <strong>I20</strong>
        </p>
        <p id="18c3dcdc-f195-4ebe-a666-8d0611e2be7e" class="">
          <em>transition</em>(I30,5)= <strong>I21</strong>
        </p>
        <p id="aca78efb-674f-47ba-bc1a-a92c978e9fef" class="">
          <em>transition</em>(I30,6)= <strong>I22</strong>
        </p>
        <p id="c5a02999-1aed-4a97-833a-d387ef9873d4" class="">
          <em>transition</em>(I30,7)= <strong>I23</strong>
        </p>
        <p id="cc76ef4d-eb1c-4fe3-89dc-bbe398fcb98d" class="">
          <em>transition</em>(I30,8)= <strong>I24</strong>
        </p>
        <p id="864c5526-e59f-43db-9360-fac2b2b98c4c" class="">
          <em>transition</em>(I30,9)= <strong>I25</strong>
        </p>
        <p id="629d9690-a582-4560-a6d3-5d41bf9ec728" class="">
          <em>transition</em>(I31, F)= <strong>I11</strong>
        </p>
        <p id="34b2d867-02d1-4f99-b731-d54a4bf8ece1" class="">
          <em>transition</em>(I31, ()= <strong>I12</strong>
        </p>
        <p id="825ff943-3bf7-4876-9e13-4161a4bd8fb6" class="">
          <em>transition(I</em>31 <em>, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="fff23e99-5119-46ef-a2e8-50137b4f460b" class="">
          <em>transition</em>(I31, N)= <strong>I14</strong>
        </p>
        <p id="193f121e-b3f0-4c5c-9d76-1b5154fdc179" class="">
          <em>transition</em>(I31, D) <strong>=I15</strong>
        </p>
        <p id="321edb1c-8029-473d-a08f-e2f3ae883ea8" class="">
          <em>transition</em>(I31,0)= <strong>I16</strong>
        </p>
        <p id="860feaa0-de49-4c9f-b292-7167db53f95a" class="">
          <em>transition</em>(I31,1)= <strong>I17</strong>
        </p>
        <p id="68dcb843-297f-497c-b40e-9b76900ab89b" class="">
          <em>transition</em>(I31,2)= <strong>I18</strong>
        </p>
        <p id="f4970c04-39af-47ff-90aa-b8a7697a82a4" class="">
          <em>transition</em>(I31,3)= <strong>I19</strong>
        </p>
        <p id="2875233a-76b5-4a3e-8408-bf0e4daa5dbf" class="">
          <em>transition</em>(I31,4)= <strong>I20</strong>
        </p>
        <p id="ecc74bd9-d341-45b1-9fbc-6e6147a89a1d" class="">
          <em>transition</em>(I31,5)= <strong>I21</strong>
        </p>
        <p id="4be07aa2-0610-4e06-90b9-c5f9475e0e10" class="">
          <em>transition</em>(I31,6)= <strong>I22</strong>
        </p>
        <p id="c472a57e-2e25-4b2a-90d5-03d121f2ba23" class="">
          <em>transition</em>(I31,7)= <strong>I23</strong>
        </p>
        <p id="468c165d-82c4-460c-ae5c-d5caf6108c4a" class="">
          <em>transition</em>(I31,8)= <strong>I24</strong>
        </p>
        <p id="85a7c4a3-eb2d-4d8a-830e-5cac5b9be4b9" class="">
          <em>transition</em>(I31,9)= <strong>I25</strong>
        </p>
        <p id="6ba5eb5d-135a-4358-85c9-fd6f630713ae" class="">
          <em>transition</em>(I32,))= <mark class="highlight-teal">{F -&gt; ( E ).}</mark>
          <mark class="highlight-teal">
            <strong>=I45</strong>
          </mark>
        </p>
        <p id="e8a6ad3f-0995-40aa-b64c-b4269cb17a18" class="">
          <em>transition</em>(I32,+)= <strong>I30</strong>
        </p>
        <p id="4dc9ca54-dfe1-4791-a33a-6f73303aa87a" class="">
          <em>transition</em>(I34, S)={S -&gt; if ( C ) S.else S}= <strong>I46</strong>
        </p>
        <p id="a823000a-f65a-4764-b003-88259dc9d5eb" class="">
          <em>transition</em>(I34, id)= <strong>I3</strong>
        </p>
        <p id="68b2e2fe-8f69-4fcf-a488-b7e3fb010ea8" class="">
          <em>transition</em>(I34, if)= <strong>I4</strong>
        </p>
        <p id="a1101368-488f-4dfc-b400-61a079c75746" class="">
          <em>transition</em>(I34, while)= <strong>I5</strong>
        </p>
        <p id="5b763bc6-d5bc-4965-9283-42b6035bc777" class="">
          <em>transition</em>(I35, E)= <mark class="highlight-teal">{C -&gt; E R E</mark>.; E -&gt; E.+ T}= <strong>I47</strong>
        </p>
        <p id="f50d9d15-f9a7-48c3-b766-9cd72f98d86d" class="">
          <em>transition</em>(I35, T)= <strong>I10</strong>
        </p>
        <p id="49a93bb4-dc65-4082-b68a-1187ac75f974" class="">
          <em>transition</em>(I35, F)= <strong>I11</strong>
        </p>
        <p id="9de1f762-d541-4c43-8f1d-14027f11f9c0" class="">
          <em>transition</em>(I35, ()= <strong>I12</strong>
        </p>
        <p id="13e739fa-93c9-420c-98b0-1c27b2940e66" class="">
          <em>transition(I</em>35 <em>, id)=</em>
          <strong>I13</strong>
        </p>
        <p id="62b449e1-57c2-4cd0-995f-4004b5b9e3e3" class="">
          <em>transition</em>(I35, N)= <strong>I14</strong>
        </p>
        <p id="416b3dab-54c4-438f-bd3f-d060aec034a5" class="">
          <em>transition</em>(I35, D) <strong>=I15</strong>
        </p>
        <p id="fa3fee6b-fc2a-4823-8f1b-f7387b92e3d2" class="">
          <em>transition</em>(I35,0)= <strong>I16</strong>
        </p>
        <p id="966560bb-7de1-4278-b42a-f9c0a06a92eb" class="">
          <em>transition</em>(I35,1)= <strong>I17</strong>
        </p>
        <p id="3ef10f6d-65c6-473e-abe4-962c56f7cf4f" class="">
          <em>transition</em>(I35,2)= <strong>I18</strong>
        </p>
        <p id="fef5255d-a449-4515-9855-fac481dc7c30" class="">
          <em>transition</em>(I35,3)= <strong>I19</strong>
        </p>
        <p id="8295f669-3a85-4e36-b324-859b2cc428e0" class="">
          <em>transition</em>(I35,4)= <strong>I20</strong>
        </p>
        <p id="b18565e9-652a-4227-a6ba-8e14b138c7d4" class="">
          <em>transition</em>(I35,5)= <strong>I21</strong>
        </p>
        <p id="b4832376-5811-4db8-92b5-feeb73fc5eb6" class="">
          <em>transition</em>(I35,6)= <strong>I22</strong>
        </p>
        <p id="0ec68bab-4411-42a8-9457-3119d40cd2af" class="">
          <em>transition</em>(I35,7)= <strong>I23</strong>
        </p>
        <p id="6f21f81f-e851-4e8b-8b39-aea79c110fd3" class="">
          <em>transition</em>(I352,8)= <strong>I24</strong>
        </p>
        <p id="0931db7b-57f0-4c13-86d8-e47df56ca8f0" class="">
          <em>transition</em>(I35,9)= <strong>I25</strong>
        </p>
        <p id="73c26415-3886-48ff-95f0-236b1387b2fe" class="">
          <em>transition</em>(I42, S)= <mark class="highlight-teal">{S -&gt; while ( C ) S.}=</mark>
          <mark class="highlight-teal">
            <strong>I48</strong>
          </mark>
        </p>
        <p id="22b1a117-d2fa-405c-a1c6-b530a4efd8bf" class="">
          <em>transition</em>(I42, id)= <strong>I3</strong>
        </p>
        <p id="41e44b1d-49c1-4054-867c-476de5448652" class="">
          <em>transition</em>(I42, if)= <strong>I4</strong>
        </p>
        <p id="c078343e-1706-4271-a7ee-33043bcd2340" class="">
          <em>transition</em>(I42, while)= <strong>I5</strong>
        </p>
        <p id="5c507fd2-38bc-4bcf-a353-2f0f1d58d4a0" class="">
          <em>transition</em>(I43, *)= <strong>I31</strong>
        </p>
        <p id="aaf1f16b-0596-4452-94f0-1b34d9bdaaca" class="">
          <em>transition</em>(I46, else)={S -&gt; if ( C ) S else.S; S -&gt; .id = E ;; S -&gt; .if ( C ) S else S; S -&gt; .while ( C ) S}= <strong>I49</strong>
        </p>
        <p id="72cf05cd-5943-4ec2-9717-5342b2047962" class="">
          <em>transition</em>(I47, +)= <strong>I30</strong>
        </p>
        <p id="dfc66cf2-927a-4ab7-b9c8-8336f1dca4cd" class="">
          <em>transition</em>(I49, S)= <mark class="highlight-teal">{S -&gt; if ( C ) S else S.}=</mark>
          <mark class="highlight-teal">
            <strong>I50</strong>
          </mark>
        </p>
        <p id="0f99ab6a-31dc-43a5-aac1-5b87aca19dbb" class="">
          <em>transition</em>(I49, id)= <strong>I3</strong>
        </p>
        <p id="7b8e2a28-1d74-4cd3-b95e-db61cd620f67" class="">
          <em>transition</em>(I49, if)= <strong>I4</strong>
        </p>
        <p id="556ee85a-7c4b-4fab-a074-aa9a47b3b74f" class="">
          <em>transition</em>(I49, while)= <strong>I5</strong>
        </p>
        <h2 id="f6e9adfb-c32e-408f-a559-d201e69aa627" class="">2.4) Table SLR </h2>
        <figure id="b3224873-caef-4762-be8f-86456385ed2e">
          <div class="source">
               <table border="1">
      <thead>
        <tr>
          <th colspan="38">LR table</th>
        </tr>
        <tr>
          <th rowspan="2">State</th>
          <th rowspan="1" colspan="27">ACTION</th>
          <th colspan="10">GOTO</th>
        </tr>
        <tr>
          <th>id</th>
          <th>=</th>
          <th>;</th>
          <th>if</th>
          <th>(</th>
          <th>)</th>
          <th>else</th>
          <th>while</th>
          <th>+</th>
          <th>*</th>
          <th>0</th>
          <th>1</th>
          <th>2</th>
          <th>3</th>
          <th>4</th>
          <th>5</th>
          <th>6</th>
          <th>7</th>
          <th>8</th>
          <th>9</th>
          <th>==</th>
          <th>!=</th>
          <th>&lt;</th>
          <th>&lt;=</th>
          <th>&gt;</th>
          <th>&gt;=</th>
          <th>$</th>
          <th>P'</th>
          <th>P</th>
          <th>S</th>
          <th>E</th>
          <th>T</th>
          <th>F</th>
          <th>N</th>
          <th>D</th>
          <th>C</th>
          <th>R</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td style="color: blue;">0</td>
          <td>r <sub style="color: green;">2</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">2</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">2</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">2</sub>
          </td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">1</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">1</td>
          <td>s <span style="color: blue;">3</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">4</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">5</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: green;">acc</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">2</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">2</td>
          <td>r <sub style="color: green;">1</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">1</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">1</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">1</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">3</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">6</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">4</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">7</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">5</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">8</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">6</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">9</span>
          </td>
          <td>
            <span style="color: blue;">10</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">7</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">27</span>
          </td>
          <td>
            <span style="color: blue;">10</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>
            <span style="color: blue;">26</span>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">8</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">27</span>
          </td>
          <td>
            <span style="color: blue;">10</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>
            <span style="color: blue;">28</span>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">9</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">29</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">30</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">10</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>s <span style="color: blue;">31</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>r <sub style="color: green;">7</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">11</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>r <sub style="color: green;">9</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">12</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">32</span>
          </td>
          <td>
            <span style="color: blue;">10</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">13</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>r <sub style="color: green;">11</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">14</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>r <sub style="color: green;">12</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">33</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">15</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>r <sub style="color: green;">14</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">16</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>r <sub style="color: green;">15</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">17</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>r <sub style="color: green;">16</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">18</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>r <sub style="color: green;">17</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">19</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>r <sub style="color: green;">18</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">20</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>r <sub style="color: green;">19</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">21</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>r <sub style="color: green;">20</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">22</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>r <sub style="color: green;">21</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">23</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>r <sub style="color: green;">22</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">24</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>r <sub style="color: green;">23</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">25</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>r <sub style="color: green;">24</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">26</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">34</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">27</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">30</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">36</span>
          </td>
          <td>s <span style="color: blue;">37</span>
          </td>
          <td>s <span style="color: blue;">38</span>
          </td>
          <td>s <span style="color: blue;">39</span>
          </td>
          <td>s <span style="color: blue;">40</span>
          </td>
          <td>s <span style="color: blue;">41</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">35</span>
          </td>
        </tr>
        <tr>
          <td style="color: blue;">28</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">42</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">29</td>
          <td>r <sub style="color: green;">3</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">3</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">3</sub>
          </td>
          <td>r <sub style="color: green;">3</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">3</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">30</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">43</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">31</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">44</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">32</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">45</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">30</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">33</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>r <sub style="color: green;">13</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">34</td>
          <td>s <span style="color: blue;">3</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">4</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">5</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">46</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">35</td>
          <td>s <span style="color: blue;">13</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">12</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">16</span>
          </td>
          <td>s <span style="color: blue;">17</span>
          </td>
          <td>s <span style="color: blue;">18</span>
          </td>
          <td>s <span style="color: blue;">19</span>
          </td>
          <td>s <span style="color: blue;">20</span>
          </td>
          <td>s <span style="color: blue;">21</span>
          </td>
          <td>s <span style="color: blue;">22</span>
          </td>
          <td>s <span style="color: blue;">23</span>
          </td>
          <td>s <span style="color: blue;">24</span>
          </td>
          <td>s <span style="color: blue;">25</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">47</span>
          </td>
          <td>
            <span style="color: blue;">10</span>
          </td>
          <td>
            <span style="color: blue;">11</span>
          </td>
          <td>
            <span style="color: blue;">14</span>
          </td>
          <td>
            <span style="color: blue;">15</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">36</td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>r <sub style="color: green;">26</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">37</td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>r <sub style="color: green;">27</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">38</td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>r <sub style="color: green;">28</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">39</td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>r <sub style="color: green;">29</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">40</td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>r <sub style="color: green;">30</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">41</td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>r <sub style="color: green;">31</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">42</td>
          <td>s <span style="color: blue;">3</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">4</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">5</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">48</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">43</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>s <span style="color: blue;">31</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>r <sub style="color: green;">6</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">44</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>r <sub style="color: green;">8</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">45</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>r <sub style="color: green;">10</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">46</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">49</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">47</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">25</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">30</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">48</td>
          <td>r <sub style="color: green;">5</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">5</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">5</sub>
          </td>
          <td>r <sub style="color: green;">5</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">5</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">49</td>
          <td>s <span style="color: blue;">3</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">4</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>s <span style="color: blue;">5</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>
            <span style="color: blue;">50</span>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td style="color: blue;">50</td>
          <td>r <sub style="color: green;">4</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">4</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">4</sub>
          </td>
          <td>r <sub style="color: green;">4</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>r <sub style="color: green;">4</sub>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </tbody>
    </table>
          </div>
        </figure>
        <h2 id="ab10003e-8507-4c5c-9480-81bb881ceefa" class="">2.5) Automate SLR </h2>
        <p id="04bf3464-d1ed-4c28-b415-d730105dd8ce" class="">Note : L&#x27;ordre des états n&#x27;est pas le même et on a utilisé les termes « <em>chiffre </em>» et « <em>oprel </em>» pour représenter les chiffres et les opérations de comparaison, respectivement. </p>
        <figure id="b21081ca-5447-4c60-8610-3b85fc0e4443">
          <div class="source">
            <a href="src/automaton.png">https://prod-files-secure.s3.us-west-2.amazonaws.com/f8d36e31-2518-4eb7-844e-f509dc161a3d/5015a4f6-eeb9-4784-b20c-56d741a29ccf/automaton.gv.pdf</a>
          </div>
        </figure>
        <p id="d3a1aa07-edba-4c8e-a751-05e744a34e47" class=""></p>
        <p id="ec182d13-0f84-4c4c-a565-b06376565536" class=""></p>
        <p id="37ae4ac5-ccbd-4f4b-8f32-c599b129c48b" class=""></p>
        <p id="7bf38eb5-38a9-41a5-a70d-87a49d9a10ed" class=""></p>
        <p id="6d11f5ec-dc34-4520-92eb-6531381c46ce" class=""></p>
        <p id="6435c59c-fbc7-458f-bae1-f370e97f2348" class=""></p>
      </div>
    </article>
    <span class="sans" style="font-size:14px;padding-top:2em"></span>
  </body>
</html>
