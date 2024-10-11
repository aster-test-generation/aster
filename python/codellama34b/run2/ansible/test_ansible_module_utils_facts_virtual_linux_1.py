import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector



class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_get_virtual_facts(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_get_product_facts(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_vmware(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_vmware()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_virtualbox(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_virtualbox()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_kvm(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_kvm()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_xen(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_xen()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_lxc(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_lxc()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_openvz(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_openvz()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_lxd(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_lxd()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_systemd_nspawn(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_systemd_nspawn()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_docker(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_docker()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_podman(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_podman()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_rkt(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_rkt()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_nspawn(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_nspawn()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_bhyve(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_bhyve()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_zones(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_zones()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_vserver(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_vserver()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()