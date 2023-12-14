// (1) 회원정보 수정
function update(userid, event) {
 event.preventDefault();

 let data = $("#profileUpdate").serialize();

 console.log(data);

 $.ajax({
 type: "put",
 url: `/api/user/${userid}`,
 data:data,
 contentType :"application/x-www-form-urlencoded; charset=utf-8",
 dataType : "json"
 }).done(res=>{
 console.log("성공", res);
 location.href = `/user/${userid}`;
 }).fail(error=>{
       alert(JSON.stringify(error.responseJSON.data));
      // alert(error.responseJSON.data);
         console.log("실패", error.responseJSON.data);
         });
}