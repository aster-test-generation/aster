import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six.moves import configparser
from ansible.module_utils.six import PY2


class TestYumRepository(unittest.TestCase):
    def test_add_repository(self):
        module = AnsibleModule(dict(name='epel', description='EPEL YUM repo', baseurl='https://download.fedoraproject.org/pub/epel/$releasever/$basearch/'))
        yumrepo = YumRepo(module)
        yumrepo.add()
        self.assertEqual(yumrepo.params['name'], 'epel')
        self.assertEqual(yumrepo.params['description'], 'EPEL YUM repo')
        self.assertEqual(yumrepo.params['baseurl'], 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/')

    def test_remove_repository(self):
        module = AnsibleModule(dict(name='epel', state='present'))
        yumrepo = YumRepo(module)
        yumrepo.remove()
        self.assertEqual(yumrepo.params['state'], 'absent')

    def test_add_multiple_repositories(self):
        module = AnsibleModule(dict(name='epel', description='EPEL YUM repo', file='external_repos', baseurl='https://download.fedoraproject.org/pub/epel/$releasever/$basearch/', gpgcheck='no'))
        yumrepo = YumRepo(module)
        yumrepo.add()
        module = AnsibleModule(dict(name='rpmforge', description='RPMforge YUM repo', file='external_repos', baseurl='http://apt.sw.be/redhat/el7/en/$basearch/rpmforge', mirrorlist='http://mirrorlist.repoforge.org/el7/mirrors-rpmforge', enabled='no'))
        yumrepo = YumRepo(module)
        yumrepo.add()
        self.assertEqual(yumrepo.params['name'], 'rpmforge')
        self.assertEqual(yumrepo.params['description'], 'RPMforge YUM repo')
        self.assertEqual(yumrepo.params['baseurl'], 'http://apt.sw.be/redhat/el7/en/$basearch/rpmforge')
        self.assertEqual(yumrepo.params['mirrorlist'], 'http://mirrorlist.repoforge.org/el7/mirrors-rpmforge')
        self.assertEqual(yumrepo.params['enabled'], 'no')

    def test_remove_multiple_repositories(self):
        module = AnsibleModule(dict(name='epel', state='absent', file='external_repos'))
        yumrepo = YumRepo(module)
        yumrepo.remove()
        module = AnsibleModule(dict(name='rpmforge', state='absent', file='external_repos'))
        yumrepo = YumRepo(module)
        yumrepo.remove()
        self.assertEqual(yumrepo.params['state'], 'absent')

    def test_add_repository_with_baseurl(self):
        module = AnsibleModule(dict(name='epel', description='EPEL YUM repo', baseurl=['https://download.fedoraproject.org/pub/epel/$releasever/$basearch/', 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/']), True)
        yumrepo = YumRepo(module)
        yumrepo.add()
        self.assertEqual(yumrepo.params['baseurl'], 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/\nhttps://download.fedoraproject.org/pub/epel/$releasever/$basearch/')

if __name__ == '__main__':
    unittest.main()