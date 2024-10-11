import unittest
from ansible.modules.apt_repository import UbuntuSourcesList


class TestUbuntuSourcesList(unittest.TestCase):
    def test_add_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(sourceslist.sources, ['deb http://archive.canonical.com/ubuntu hardy partner'])

    def test_remove_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        sourceslist.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertEqual(sourceslist.sources, [])

    def test_add_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        self.assertEqual(sourceslist.ppa_keys, ['ppa:nginx/stable'])

    def test_remove_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        sourceslist.remove_ppa_signing_key('ppa:nginx/stable')
        self.assertEqual(sourceslist.ppa_keys, [])

if __name__ == '__main__':
    unittest.main()