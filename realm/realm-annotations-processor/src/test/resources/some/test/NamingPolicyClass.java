/*
 * Copyright 2017 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package some.test;

import io.realm.annotations.RealmClass;
import io.realm.RealmObject;
import io.realm.annotations.RealmField;
import io.realm.annotations.RealmNamingPolicy;

/**
 * Class with naming policy
 */
@RealmClass(fieldNamingPolicy = RealmNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) // Fields become "last_name"
public class NamingPolicyClass extends RealmObject {

    public String firstName;
    @RealmField(name = "last-name") // This will take precendence
    public String lastName;
}