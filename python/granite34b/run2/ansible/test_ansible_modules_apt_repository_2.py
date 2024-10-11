import unittest
from ansible.modules.apt_repository import SourcesList


class TestUbuntuSourcesList(unittest.TestCase):
    def test_get_ppa_info(self):
        sources_list = UbuntuSourcesList(module)
        owner_name = "owner"
        ppa_name = "name"
        lp_api = sources_list.LP_API % (owner_name, ppa_name)
        headers = {"Accept": "application/json"}
        response, info = fetch_url(module, lp_api, headers=headers)
        if info["status"] != 200:
            self.fail("Failed to fetch PPA information")
        info = json.loads(to_native(response.read()))
        self.assertEqual(info["owner"], owner_name)
        self.assertEqual(info["name"], ppa_name)

    def test_expand_ppa(self):
        sources_list = UbuntuSourcesList(module)
        ppa = "ppa:owner/name"
        ppa_owner = "owner"
        ppa_name = "name"
        line = "deb http://ppa.launchpad.net/%s/%s/ubuntu %s main" % (ppa_owner, ppa_name, sources_list.codename)
        source, owner, name = sources_list._expand_ppa(ppa)
        self.assertEqual(source, line)
        self.assertEqual(owner, ppa_owner)
        self.assertEqual(name, ppa_name)

    def test_key_already_exists(self):
        sources_list = UbuntuSourcesList(module)
        key_fingerprint = "fingerprint"
        rc, out, err = module.run_command("apt-key export %s" % key_fingerprint, check_rc=True)
        if len(err) == 0:
            self.assertTrue(sources_list._key_already_exists(key_fingerprint))
        else:
            self.assertFalse(sources_list._key_already_exists(key_fingerprint))

    def test_add_source(self):
        sources_list = UbuntuSourcesList(module)
        line = "deb http://ppa.launchpad.net/owner/name/ubuntu %s main" % sources_list.codename
        sources_list.add_source(line)
        self.assertIn(line, sources_list.repos_urls)

if __name__ == '__main__':
    unittest.main()